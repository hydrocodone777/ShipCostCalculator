import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        Scanner inprice = new Scanner(System.in);
        System.out.print("Enter the price of the item ");
        if (inprice.hasNextInt()) {
            itemPrice = inprice.nextInt();
            inprice.nextLine();
            if (itemPrice >= 100) {
                shippingCost = 0;
                totalPrice = itemPrice;
                System.out.println("Your total price is " + totalPrice);
            } else {
                shippingCost = itemPrice * 0.02;
                totalPrice = itemPrice + shippingCost;
                System.out.println("Your total price is " + totalPrice);
            }
        }
    }
}