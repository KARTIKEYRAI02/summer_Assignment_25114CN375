import java.util.HashMap;
import java.util.Map;
public class Q92 {
public static Character findMax(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> counts = new HashMap<>();
        char maxChar = str.charAt(0);
        int maxCount = 0;

        for (char c : str.toCharArray()) {
            int currentCount = counts.getOrDefault(c, 0) + 1;
            counts.put(c, currentCount);

            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = c;
            }
        }
     return maxChar;
    }
public static void main(String[] args) {
        String testString = "java programming";
        System.out.println(findMax(testString));
    }
}