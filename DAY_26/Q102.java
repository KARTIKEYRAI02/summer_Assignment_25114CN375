import java.util.Scanner;
public class Q102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else if (age >= 0) {
            int yearsLeft = 18 - age;
            System.out.println("You are not eligible to vote. Please wait " + yearsLeft + " more years.");
        } else {
            System.out.println("Invalid age entered.");
        }
    }
}