import org.apache.commons.math3.distribution.GeometricDistribution;

import java.util.Map;

/**
 * calculate base distribution
 */
public class FragmentDistribution {
    private static double p$ = 0.5;
    // 通过cfg计算出的最大似然概率
    public static Map<Integer, Map<Object, Double>> mlList = Persistence.readCFG();

    private static int getSize(Node root) {
        if (root == null) return 0;
        int result = 1;
        for (Node child : root.children) {
            result += getSize(child);
        }
        return result;
    }

    private static void getProduction(Node root, Double result) {
        if (root == null) return;
        if (root.isTerminal) {
            return;
        }
        Map<Object, Double> map = mlList.get(root.type);
        for (Object o : map.keySet()) {
            if (o instanceof Integer) {
                int type = (int) o;
                for (Node child : root.children) {
                    if (child != null) {
                        if (child.type == type) {
                            result *= map.get(o);
                        }
                    }
                }


            } else {
                String content = (String) o;
                for (Node child : root.children) {
                    if (child != null) {
                        if (child.content.equals(content)) {
                            result *= map.get(o);
                        }
                    }
                }


            }
        }
        for (Node child : root.children) {
            getProduction(child, result);
        }


    }

    public static double calculate(Node root) {
        GeometricDistribution geo = new GeometricDistribution(p$);
        int tSize = getSize(root);
        double pgeo = geo.probability(tSize);
        Double product = new Double(1.0);
        getProduction(root, product);
        return pgeo * product;
    }

}
