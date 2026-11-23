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
        // used to get and set the name, stock, price, and description of an item
        }
    }
        Item apple = new Item("Apple", 10, 0.99, "A juicy red apple.");
        Item banana = new Item("Banana", 20, 0.59, "A ripe yellow banana.");
        Item orange = new Item("Orange", 15, 0.79, "A sweet... orange orange.");
        // sets the items to be used in the inventory
        
        int choice = 0;
        while (choice != 5) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do? (Edit stock of items: input 1, Edit price of items: input 2, View items: input 3, Delete an item: input 4, Exit: input 5)");
        choice = scanner.nextInt();
        scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("Which item would you like to edit the stock of? (Apple: input 1, Banana: input 2, Orange: input 3)");
            int itemChoice = scanner.nextInt();
            scanner.nextLine();
            switch (itemChoice) {
                case 1:
                    System.out.println("What would you like to set the stock of Apple to?");
                    int newStock = scanner.nextInt();
                    apple.setStock(newStock);
                    System.out.println("Stock of Apple: " + apple.getStock());
                    // asks for new stock of apple and sets it to the new stock
                    break;
                case 2:
                    System.out.println("What would you like to set the stock of Banana to?");
                    int newStockBanana = scanner.nextInt();
                    banana.setStock(newStockBanana);
                    System.out.println("Stock of Banana: " + banana.getStock());
                    // does the same for banana
                    break;
                case 3:
                    System.out.println("What would you like to set the stock of Orange to?");
                    int newStockOrange = scanner.nextInt();
                    orange.setStock(newStockOrange);
                    System.out.println("Stock of Orange: " + orange.getStock());
                    // and again for orange
                    break;
            }
            break;
            case 2:
                System.out.println("Which item would you like to edit the price of? (Apple: input 1, Banana: input 2, Orange: input 3)");
            int itemChoicePrice = scanner.nextInt();
            scanner.nextLine();
            switch (itemChoicePrice) {
                case 1:
                    System.out.println("What would you like to set the price of Apple to?");
                    double newPrice = scanner.nextDouble();
                    apple.setPrice(newPrice);
                    System.out.println("Price of Apple: " + apple.getPrice());
                    // asks for new price of apple and sets it to the new price
                    break;
                case 2:
                    System.out.println("What would you like to set the price of Banana to?");
                    double newPriceBanana = scanner.nextDouble();
                    banana.setPrice(newPriceBanana);
                    System.out.println("Price of Banana: " + banana.getPrice());
                    // does the same for banana
                    break;
                case 3:
                    System.out.println("What would you like to set the price of Orange to?");
                    double newPriceOrange = scanner.nextDouble();
                    orange.setPrice(newPriceOrange);
                    System.out.println("Price of Orange: " + orange.getPrice());
                    // and yet again for orange
                    break;
            }
            break;
            case 3:
                System.out.println("Items in the shop:");
                if (apple.getStock() == 0) {
                    System.out.println("Apple: Has been deleted. Add stock to add it back.");
                } else {
                    System.out.println("Apple: " + apple.getStock() + " apples costing $" + apple.getPrice() + " - " + apple.getDescription());
                }
                if (banana.getStock() == 0) {
                    System.out.println("Banana: Has been deleted. Add stock to add it back.");
                } else {
                    System.out.println("Banana: " + banana.getStock() + " bananas costing $" + banana.getPrice() + " - " + banana.getDescription());
                }
                if (orange.getStock() == 0) {
                    System.out.println("Orange: Has been deleted. Add stock to add it back.");
                } else {
                    System.out.println("Orange: " + orange.getStock() + " oranges costing $" + orange.getPrice() + " - " + orange.getDescription());
                }
                break;
            case 4:
                System.out.println("Which item would you like to delete? (Apple: input 1, Banana: input 2, Orange: input 3)");
            int itemChoiceDelete = scanner.nextInt();
            scanner.nextLine();
            switch (itemChoiceDelete) {
                case 1:
                    apple.setStock(0);
                    System.out.println("Apple deleted.");
                    break;
                case 2:
                    banana.setStock(0);
                    System.out.println("Banana deleted.");
                    break;
                case 3:
                    orange.setStock(0);
                    System.out.println("Orange deleted.");
                    break;
            }
                break;
            case 5:
                // exits the program and loop
                System.out.println("Exiting...");
                break;
            default:
                // happens if an invalid number is entered
                System.out.println("Invalid choice.");
                break;
            }
        }
    }
}