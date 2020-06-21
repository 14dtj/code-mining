import java.util.ArrayList;
import java.util.List;

public class Node {
    public int type;
    public String content;
    public List<Node> children = new ArrayList<>();
    public boolean isTerminal;
    public Node root;
    public Node parent;
    // whether the node is root of a new fragment
    public boolean zs = false;

    public Node(int type) {
        this.type = type;
        this.isTerminal = false;
    }

    public Node(String content) {
        this.content = content;
        this.isTerminal = true;
    }
}
