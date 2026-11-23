import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        class Item {
            private String name;
            private int stock;
            private double price;
            private String description;

            public Item(String name, int stock, double price, String description) {
                this.name = name;
                this.stock = stock;
                this.price = price;
                this.description = description;
            // used to create items with name, stock, price, and description
            }
        public String getName() {
            return name;
        }
        public int getStock() {
            return stock;
        }
        public double getPrice() {
            return price;
        }
        public String getDescription() {
            return description;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setStock(int stock) {
            this.stock = stock;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void setDescription(String description) {
            this.description = description;
        }
    }
        Item apple = new Item("Apple", 10, 0.99, "A juicy red apple.");
        Item banana = new Item("Banana", 20, 0.59, "A ripe yellow banana.");
        Item orange = new Item("Orange", 15, 0.79, "A sweet... orange orange.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? (Edit stock of items: input 1, Edit price of items: input 2, View items: input 3, Delete an item: input 4)");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
            System.out.println("Which item would you like to edit the stock of? (Apple: input 1, Banana: input 2, Orange: input 3)");
            int itemChoice = scanner.nextInt();
            scanner.nextLine();
            switch (itemChoice) {
                case 1:
                    System.out.println("Editing stock of Apple...");
                
                    // Edit stock of Apple
                    break;
                case 2:
                    System.out.println("Editing stock of Banana...");
                    // Edit stock of Banana
                    break;
                case 3:
                    System.out.println("Editing stock of Orange...");
                    // Edit stock of Orange
                    break;
            }
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