import java.util.Scanner;
public class Q9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:"); 
        int number = sc.nextInt();
        
        
        if (number == 2){
            System.out.println("number is a prime number.");
            
        } else {
            boolean isPrime = true;
             for(int i = 2; i <= number-1 ; i++)
             {                 if(number % i == 0)
                 {
                     isPrime = false;
                     break;
                 }
             }
                if(isPrime == true)
                {
                    System.out.println(number + " is a prime number.");
                }
                else
                {
                    System.out.println(number + " is not a prime number.");
                }



        }
        }
        
}