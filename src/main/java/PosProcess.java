import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PosProcess {
    Map<Node, Integer> multiSet = new HashMap<>();
    int threshold;
    int minHeight = 3;

    public void setThreshold() {
        //TODO 根据数据集大小动态调整threshold
    }

    public void merge(Node root) {
        if (root.zs) {
            int c = multiSet.getOrDefault(root, 0);
            multiSet.put(root, c + 1);
            //断开
            if (root.parent != null) {
                root.parent.children.remove(root);
                root.parent = null;
            }

        }
        List<Node> children = root.children;
        for (Node child : children) {
            merge(child);
        }
    }

    public void prune() {
        setThreshold();
        for (Node n : multiSet.keySet()) {
            if (multiSet.get(n) < threshold) {
                multiSet.remove(n);
            }
            if (getHeight(n) < minHeight) {
                multiSet.remove(n);
            }
        }
    }

    public int getHeight(Node node) {
        if (node == null) return 0;
        int max = 0;
        if (node.children == null) return 1;
        for (Node child : node.children) {
            max = Math.max(max, getHeight(child));
        }
        return max + 1;
    }

    /**
     * 后处理的对外接口
     *
     * @param root
     */
    public void posProcess(Node root) {
        merge(root);
        prune();
        IOHelper.writeFile(multiSet);

    }
}
