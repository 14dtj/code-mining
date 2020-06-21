import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Persistence {

    public static void writeCFG() {
        Map<Integer, Map<Object, Double>> mlList = new HashMap<>(101);
        int index = 0;
        for (Map<Object, Integer> map : CodeParser.countList) {
            if (map.isEmpty()) {
                index++;
                continue;
            }
            Map<Object, Double> prob = new HashMap<>();
            int sum = 0;
            for (int num : map.values()) {
                sum += num;
            }
            for (Map.Entry<Object, Integer> entry : map.entrySet()) {
                Object key = entry.getKey();
                int val = entry.getValue();
                prob.put(key, val / (sum * 1.0));
            }
            mlList.put(index, prob);
            index++;
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("prob.cfg"));
            oos.writeObject(mlList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Map readCFG() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("prob.cfg"));
            Map<Integer, Map<Object, Double>> mlList = (Map) ois.readObject();
            return mlList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
