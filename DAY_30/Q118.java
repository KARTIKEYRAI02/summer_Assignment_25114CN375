import java.util.Scanner;
public class Q118 {
    String[] books = {"C/C++", "Python", "JAVA", "DSA", "DBMS"};
    boolean[] issued = new boolean[5];

    void displayBooks() {
        System.out.println("\nAvailable Books:");
        for (int i = 0; i < books.length; i++) {
            if (!issued[i]) {
                System.out.println((i + 1) + ". " + books[i]);
            }
        }
    }

    void issueBook(int n) {
        if (n >= 1 && n <= books.length && !issued[n - 1]) {
            issued[n - 1] = true;
            System.out.println("Book Issued: " + books[n - 1]);
        } else {
            System.out.println("Book Not Available");
        }
    }

    void returnBook(int n) {
        if (n >= 1 && n <= books.length && issued[n - 1]) {
            issued[n - 1] = false;
            System.out.println("Book Returned: " + books[n - 1]);
        } else {
            System.out.println("Invalid Return");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q118 lib = new Q118();

        while (true) {
            System.out.println("\n1.Display Books");
            System.out.println("2.Issue Book");
            System.out.println("3.Return Book");
            System.out.println("4.Exit");
            System.out.print("Enter Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    lib.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter Book Number: ");
                    lib.issueBook(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Book Number: ");
                    lib.returnBook(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Thank You");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}