import java.util.Scanner;
public class ShoppingCartPrinter {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();
        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scanner.nextLine());

        System.out.println("Enter the item price:");
        item1.setPrice(scanner.nextInt());

        System.out.println("Enter the item quantity:");
        item1.setQuantity(scanner.nextInt());
        System.out.println();

        System.out.println("Item 2");
        item2.setName(scanner.nextLine());
        System.out.println("Enter the item name:");
        item2.setName(scanner.nextLine());

        System.out.println("Enter the item price:");
        item2.setPrice(scanner.nextInt());

        System.out.println("Enter the item quantity:");
        item2.setQuantity(scanner.nextInt());
        System.out.println();

    }
}
