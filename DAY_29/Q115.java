import java.util.Scanner;
public class Q115 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("1.Length");
        System.out.println("2.Uppercase");
        System.out.println("3.Lowercase");
        System.out.println("4.Reverse");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Length = " + str.length());
                break;
            case 2:
                System.out.println(str.toUpperCase());
                break;
            case 3:
                System.out.println(str.toLowerCase());
                break;
            case 4:
                for (int i = str.length() - 1; i >= 0; i--)
                    System.out.print(str.charAt(i));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}