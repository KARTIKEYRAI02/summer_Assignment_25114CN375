import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        
        if (num < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
        } else {
            long result = 1; 
            
           
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            
            System.out.println("The factorial of " + num + " is: " + result);
        }
        
        
    }
}