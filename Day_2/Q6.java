import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:"); 
        int number = sc.nextInt();
 
        while(number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
    }