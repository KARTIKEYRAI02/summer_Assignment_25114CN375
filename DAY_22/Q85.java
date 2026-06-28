public class Q85{
public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
            int left = 0;
        int right = str.length() - 1;
            while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
            return true;
    }

    public static void main(String[] args) {
        String testString1 = "racecar";
        String testString2 = "hello";
        
        System.out.println(isPalindrome(testString1));
        System.out.println(isPalindrome(testString2));
    }
}