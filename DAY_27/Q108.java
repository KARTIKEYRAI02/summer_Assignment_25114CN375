import java.util.Scanner;
class Marksheet {
    String name;
    int m1, m2, m3;

    Marksheet(String name, int m1, int m2, int m3) {
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void display() {
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        if (percentage >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}
public class Q108 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        Marksheet m = new Marksheet(name, m1, m2, m3);

        System.out.println("\nMarksheet");
        m.display();
    }
}