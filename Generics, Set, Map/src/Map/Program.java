package Map;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();
            cookies.put("username", "maria");
            cookies.put("email", "maria@gmail.com");
            cookies.put("phone", "81743371");
                cookies.remove("email");
                cookies.put("phone", "81206021");
                System.out.println("ALL COOKIES:");
                for (String key : cookies.keySet()) {
                    System.out.println(key + ": " + cookies.get(key));
                }
    }
}
