package dynamiconlinemarketplace;

public class MarketPlace {
    public static void main(String[] args) {
        Product<Books> book = new Product<>("Java", 99.99, new Books());
        Product<Clothing> cloth = new Product<>("T-shirt", 999.99, new Clothing());
        Product<Gadgets> gadget = new Product<>("Laptop", 49999.99, new Gadgets());
        MarketPlaceUtil.applyDiscount(book, 10);
        MarketPlaceUtil.applyDiscount(cloth, 30);
        MarketPlaceUtil.applyDiscount(gadget, 15);
    }
}
