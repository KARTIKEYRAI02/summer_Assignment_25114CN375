import java.util.LinkedHashSet;
import java.util.Set;
public class Q96 {
public static String remove(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }
public static void main(String[] args) {
        String testString = "programming";
        System.out.println(remove(testString));
    }
}