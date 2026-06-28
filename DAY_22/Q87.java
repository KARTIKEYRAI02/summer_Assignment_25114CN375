import java.util.HashMap;
import java.util.Map;
public class Q87 {
public static void calculateFrequency(String text) {
        if (text == null || text.isEmpty()) {
            return;
        }

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
public static void main(String[] args) {
        String testString = "programming in java";
        
        System.out.println("Character frequencies:");
        calculateFrequency(testString);
    }
}