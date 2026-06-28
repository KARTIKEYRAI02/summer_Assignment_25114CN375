public class Q93 {
public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length() || str1.isEmpty()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
public static void main(String[] args) {
        String test1 = "waterbottle";
        String test2 = "erbottlewat";
        System.out.println(isRotation(test1, test2));
    }
}