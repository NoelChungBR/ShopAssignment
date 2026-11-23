import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        class Item {
            String name;
            int stock;
            double price;
            String description;

            public Item(String name, int stock, double price, String description) {
                this.name = name;
                this.stock = stock;
                this.price = price;
                this.description = description;
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? (Edit stock of items: input 1, Edit price of items: input 2, View items: input 3, Delete an item: input 4)");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Checks next input

        switch (choice) {
            case 1:
                // Edit stock of items
                break;
            case 2:
                // Edit price of items
                break;
            case 3:
                // View items
                break;
            case 4:
                // Delete an item
                break;
            default:
                // Happens if an invalid number is entered
                System.out.println("Invalid choice.");
        }
    }
}