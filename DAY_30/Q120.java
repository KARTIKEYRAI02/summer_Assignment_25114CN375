import java.util.Scanner;
public class Q120 {
static String[] bookTitles = new String[100];
    static int bookCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;
        
        while (isRunning) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewAllBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Exiting System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
            }
        }
        
        scanner.close();
    }

    static void displayMenu() {
        System.out.println("\n=========================");
        System.out.println(" Library Management Menu ");
        System.out.println("=========================");
        System.out.println("1. Add a New Book");
        System.out.println("2. View All Books");
        System.out.println("3. Search for a Book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    static int getUserChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            return choice;
        } else {
            scanner.nextLine(); 
            return -1;
        }
    }

    static void addBook() {
        if (bookCount >= bookTitles.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        
        System.out.print("Enter the title of the book: ");
        String newTitle = scanner.nextLine();
        
        if (newTitle.trim().isEmpty()) {
            System.out.println("Book title cannot be empty.");
            return;
        }
        
        bookTitles[bookCount] = newTitle;
        bookCount++;
        System.out.println("Book added successfully.");
    }

    static void viewAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books are currently in the library.");
            return;
        }
        
        System.out.println("\n--- List of Books ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + bookTitles[i]);
        }
        System.out.println("---------------------");
    }

    static void searchBook() {
        if (bookCount == 0) {
            System.out.println("Library is empty. Nothing to search.");
            return;
        }
        
        System.out.print("Enter the title to search for: ");
        String searchQuery = scanner.nextLine();
        boolean isFound = false;
        
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equalsIgnoreCase(searchQuery)) {
                System.out.println("Success! '" + bookTitles[i] + "' is available at index " + i + ".");
                isFound = true;
                break;
            }
        }
        
        if (!isFound) {
            System.out.println("Sorry, the book '" + searchQuery + "' was not found in the library.");
        }
    }
}