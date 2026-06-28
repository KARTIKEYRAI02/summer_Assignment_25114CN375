import java.util.HashSet;
import java.util.Set;
public class Q98 {
public static Set<Character> findCommon(String str1, String str2) {
        Set<Character> commonElements = new HashSet<>();
        
        if (str1 == null || str2 == null) {
            return commonElements;
        }
        
        Set<Character> charSet1 = new HashSet<>();
        for (char c : str1.toCharArray()) {
            charSet1.add(c);
        }
        
        for (char c : str2.toCharArray()) {
            if (charSet1.contains(c)) {
                commonElements.add(c);
            }
        }
        
        return commonElements;
    }
public static void main(String[] args) {
        String test1 = "hello";
        String test2 = "world";
        System.out.println(findCommon(test1, test2));
    }
}