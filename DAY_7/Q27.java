import java.util.Scanner;
public class Q27 {
    static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of digits of " + n + " is: " + sumOfDigits(n));
    }
}