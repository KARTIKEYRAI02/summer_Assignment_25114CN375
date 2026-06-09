import java.util.Scanner;
public class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a= sc.nextInt();
        
        System.out.print("b: ");
        int b = sc.nextInt();
        
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD: " + a);
    }
}