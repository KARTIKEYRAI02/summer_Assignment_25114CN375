import java.util.Scanner;
public class Q117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[n];
        String[] roll = new String[n];
        String[] course = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextLine();
            System.out.print("Enter Course: ");
            course[i] = sc.nextLine();
        }

        System.out.println("\nStudent Records");
        System.out.println("--------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name: " + name[i]);
            System.out.println("Roll No: " + roll[i]);
            System.out.println("Course: " + course[i]);
            System.out.println();
        }
    }
}