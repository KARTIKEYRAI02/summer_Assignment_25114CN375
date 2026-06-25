import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n < 1) 
{
            System.out.println("Please enter a valid natural number (greater than 0).");
        } 
        else {
    
            long sum = (long) n * (n + 1) / 2;
            
            System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
        }
        
    
    }
}
