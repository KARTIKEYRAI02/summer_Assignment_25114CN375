import java.util.LinkedHashMap;
import java.util.Map;
public class Q89 {
public static Character find(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }
public static void main(String[] args) {
        String testString = "programming";
        System.out.println(find(testString));
    }
}