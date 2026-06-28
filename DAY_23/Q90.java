import java.util.HashSet;
import java.util.Set;
public class Q90 {
public static Character find(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.add(c)) {
                return c;
            }
        }

        return null;
    }
public static void main(String[] args) {
        String testString = "programming";
        System.out.println(find(testString));
    }
}