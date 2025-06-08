import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args){
    String itemName = "";
    double price = 0;
    int quantity =0;
    double totalPrice = 0;
    Scanner scanner = new Scanner((System.in));
        System.out.print("What item would you like to buy:?");
        itemName = scanner.nextLine();
        System.out.print("What is the price for each ?:");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        totalPrice = price * quantity;
        System.out.println("Item name" + itemName);
        System.out.println("price for each " + price );
        System.out.println("total" + totalPrice );
     scanner.close();

    }
}
