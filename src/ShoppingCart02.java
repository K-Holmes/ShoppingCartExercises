public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.
        double price, tax;
        int quantity;

        // Declare and assign a calculated totalPrice
        quantity = 2;
        price = 20.0;
        tax = 0.2;
        double totalPrice = (quantity*price)*(tax+1);

        // Modify message to include quantity
        message = custName+" wants to purchase "+quantity+" "+itemDesc + " for $" + totalPrice;

        // Print another message with the total cost
        System.out.println(message);


    }
}