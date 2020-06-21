import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class IOHelper {
    public static void writeFile(Map<Node, Integer> multiSet) {
        String fileName = "result/spring-data-example";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            for (Node n : multiSet.keySet()) {
                out.write(n.content);
            }

            out.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
