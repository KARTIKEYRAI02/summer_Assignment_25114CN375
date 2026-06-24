import java.util.Scanner;
public class Q20 {
public static void main (String[]args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    long n = sc.nextLong();
    long largestPrimeFactor = findLargestPrimeFactor(n);
    System.out.println("The largest prime factor of " + n + " is: " + largestPrimeFactor);
}
public static long findLargestPrimeFactor(long n) {
    long largestPrimeFactor = -1;
while (n % 2 == 0) {
    largestPrimeFactor = 2;
    n /= 2;
}
for (long i = 3; i <= Math.sqrt(n); i += 2) {
    while (n % i == 0) {
        largestPrimeFactor = i;
        n /= i;
    }
}
if (n > 2) {
    largestPrimeFactor = n;
}
return largestPrimeFactor;
}
}