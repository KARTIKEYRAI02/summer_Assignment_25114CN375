import java.util.HashMap;
import java.util.Map;

public class Q54 {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 4, 5, 6, 5, 38, 9, 1};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}