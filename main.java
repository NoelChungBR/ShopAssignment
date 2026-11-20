import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an item.");
        String item = scanner.nextLine();
        System.out.println("Item: " + item);
        System.out.println("Input a description for the item.");
        String description = scanner.nextLine();
        System.out.println("Description: " + description);
        System.out.println("Input a quantity for the item.");
        int quantity = scanner.nextInt();
        System.out.println("Quantity: " + quantity);
        System.out.println("Input a price for the item.");
        double price = scanner.nextDouble();
        System.out.println("Price: " + price);
    }
}
