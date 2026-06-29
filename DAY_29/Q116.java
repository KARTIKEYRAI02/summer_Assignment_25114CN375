import java.util.Scanner;
class Item {
    int id;
    String name;
    int quantity;

    Item(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Item ID: " + id);
        System.out.println("Item Name: " + name);
        System.out.println("Quantity: " + quantity);
    }
}
public class Q116 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Item item = new Item(id, name, quantity);

        System.out.println("\nInventory Details");
        item.display();
    }
}