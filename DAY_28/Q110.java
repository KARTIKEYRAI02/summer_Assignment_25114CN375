import java.util.Scanner;
class BankAccount {
    String name;
    int accountNo;
    double balance;

    BankAccount(String name, int accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}
public class Q110 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNo = sc.nextInt();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        BankAccount b = new BankAccount(name, accountNo, balance);

        System.out.println("\nBank Account Details");
        b.display();
    }
}