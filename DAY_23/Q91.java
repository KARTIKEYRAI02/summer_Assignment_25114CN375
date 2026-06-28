import java.util.Arrays;
public class Q91 {
public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
public static void main(String[] args) {
        String test1 = "Listen";
        String test2 = "Silent";
        System.out.println(areAnagrams(test1, test2));
    }
}