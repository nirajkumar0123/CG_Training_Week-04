package shoppingcart;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding products with their prices
        cart.addProduct("Laptop", 1200.0);
        cart.addProduct("Phone", 800.0);
        cart.addProduct("Headphones", 150.0);
        cart.addProduct("Mouse", 50.0);
        cart.addProduct("Keyboard", 100.0);

        // Adding items to the cart
        cart.addItemToCart("Laptop", 1);
        cart.addItemToCart("Phone", 2);
        cart.addItemToCart("Mouse", 3);
        cart.addItemToCart("Keyboard", 1);
        cart.addItemToCart("Headphones", 2);

        // Display items in order added
        cart.displayCartItemsInOrder();

        // Display items sorted by price
        cart.displayItemsSortedByPrice();

        // Display total cost
        cart.displayTotalCost();
    }
}

