import java.util.Scanner;
public class Q113 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter First Number: ");
        double a = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double b = sc.nextDouble();

        switch (ch) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Cannot Divide by Zero");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}