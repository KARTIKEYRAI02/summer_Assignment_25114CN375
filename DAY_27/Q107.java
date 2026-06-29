import java.util.Scanner;
class Salary {
    String name;
    double basic;
    double bonus;

    Salary(String name, double basic, double bonus) {
        this.name = name;
        this.basic = basic;
        this.bonus = bonus;
    }

    void display() {
        double total = basic + bonus;
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + total);
    }
}
public class Q107 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        Salary s = new Salary(name, basic, bonus);

        System.out.println("\nSalary Details");
        s.display();
    }
}