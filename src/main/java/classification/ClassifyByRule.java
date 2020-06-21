package classification;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据文件名和包名对java文件进行功能分类
 */
public class ClassifyByRule {
    public static Map<String, String> result = new HashMap<>();

    public static String[] types = {"server", "database", "ui", "algorithm", "socket","io"};

    public static Map<String, String> packageMap = new HashMap<>();

    public static Map<String, String> nameMap = new HashMap<>();

    static {
        packageMap.put("controller", "server");
        packageMap.put("model", "database");
        packageMap.put("database", "database");
        packageMap.put("repository", "database");
        packageMap.put("servlet", "server");
        packageMap.put("client", "socket");
        packageMap.put("server", "socket");
        packageMap.put("ui", "ui");
        packageMap.put("view", "ui");
        packageMap.put("io", "io");
    }

    static {
        nameMap.put("controller", "server");
        nameMap.put("repository", "database");
        nameMap.put("datasource", "database");
        nameMap.put("dao", "database");
        nameMap.put("mapper", "database");
        nameMap.put("servlet", "server");
        nameMap.put("client", "socket");
        nameMap.put("server", "socket");
        nameMap.put("queue", "algorithm");
        nameMap.put("array", "algorithm");
        nameMap.put("stack", "algorithm");
        nameMap.put("tree", "algorithm");
        nameMap.put("traversal", "algorithm");
        nameMap.put("sort", "algorithm");
        packageMap.put("window", "ui");
        packageMap.put("ui", "ui");
        packageMap.put("panel", "ui");
        packageMap.put("view", "ui");
        packageMap.put("frame", "ui");
        packageMap.put("file", "io");
        packageMap.put("reader", "io");
        packageMap.put("writer", "io");
        packageMap.put("io", "io");
    }

    public static void classify(String path) {
        String temp = path;
        path = path.toLowerCase();
        //对路径分割获得包名和文件名
        String[] arr = path.split("/");
        String packName = null;
        String fileName;
        if (arr.length >= 2) {
            packName = arr[arr.length - 2];
            fileName = arr[arr.length - 1];
        } else if (arr.length >= 1) {
            fileName = arr[0];
        } else {
            return;
        }

        if (!fileName.endsWith(".java")) {
            return;
        }
        //根据包名分类
        if (packName != null) {
            for (String key : packageMap.keySet()) {
                if (packName.contains(key)) {
                    result.put(packageMap.get(key), temp);
                }
            }
        }
        //根据文件名分类
        for (String key : nameMap.keySet()) {
            if (fileName.endsWith(key)) {
                result.put(nameMap.get(key), temp);
            }
        }
    }
}
