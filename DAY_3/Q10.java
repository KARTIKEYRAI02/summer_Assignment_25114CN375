import java.util.Scanner;
public class Q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();
        
        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();
        
        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");
        
         for (int i = lower; i <= upper; i++) {
            boolean isPrime = true;
            
            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                System.out.print(i + " ");
            }
            }
    }
}