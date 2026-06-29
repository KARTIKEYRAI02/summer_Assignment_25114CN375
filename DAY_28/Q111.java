import java.util.Scanner;
class Ticket {
    String name;
    String destination;
    int seats;

    Ticket(String name, String destination, int seats) {
        this.name = name;
        this.destination = destination;
        this.seats = seats;
    }

    void display() {
        System.out.println("Passenger Name: " + name);
        System.out.println("Destination: " + destination);
        System.out.println("Seats Booked: " + seats);
    }
}
public class Q111{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();

        Ticket t = new Ticket(name, destination, seats);

        System.out.println("\nTicket Details");
        t.display();
    }
}