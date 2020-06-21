import org.apache.commons.math3.distribution.BinomialDistribution;

public class Inference {
    private int T = 1100;
    private double alpha = 0.5;

    private double getPost(Node fragment) {
        double up = getCount(fragment) + alpha * FragmentDistribution.calculate(fragment);
        double down = getCount(fragment.root) + alpha;
        double post = up / down;
        return post;
    }

    private double getPZ0(Node t, Node s) {
        double ps = getPost(s);
        double pt = getPost(t);
        s.children.add(t);
        double pJoin = getPost(s);
        return pJoin / (pJoin + ps * pt);
    }

    public void gibbs(Node fragment) {
        for (int i = 0; i < T; i++) {
            dfs(fragment);
        }
    }

    private void dfs(Node root) {
        if (root == null) return;
        double p = getPZ0(root, root.parent);
        BinomialDistribution bio = new BinomialDistribution(1, p);
        root.zs = (bio.sample() == 1);
        if (root.children == null) return;
        for (Node child : root.children) {
            dfs(child);
        }
    }


    //返回count(fragment)
    private int getCount(Node node) {
        return 1;
    }

    public static void main(String[] args) {
        Inference inference = new Inference();
        inference.gibbs(null);
    }
}
