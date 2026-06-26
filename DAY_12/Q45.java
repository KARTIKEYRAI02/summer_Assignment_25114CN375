public class Q45 {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n = 12345;
        int reversedNumber = reverse(n);
        System.out.println("Reversed Number: " + reversedNumber);
        if (n == reversedNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}