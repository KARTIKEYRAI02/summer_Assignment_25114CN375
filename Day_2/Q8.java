import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:"); 
        int number = sc.nextInt();
        int originalnum = number;
        int reversednum = 0;
    
 while(number!=0) {
            int digit = number % 10;
            reversednum = reversednum * 10 + digit;
            number /= 10;

 }
    if(originalnum == reversednum) {
        System.out.println(originalnum + " is a palindrome.");
    } else {
        System.out.println(originalnum + " is not a palindrome.");
    }
 }
 }