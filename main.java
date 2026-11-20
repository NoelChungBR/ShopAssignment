import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an item.");
        String item = scanner.nextLine();
        System.out.println("You entered: " + item);
    }
}