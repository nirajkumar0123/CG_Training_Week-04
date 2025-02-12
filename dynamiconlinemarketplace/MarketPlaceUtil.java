package dynamiconlinemarketplace;

class MarketPlaceUtil {
    public static<T extends Product<?>> void applyDiscount(T product, double percentage){
        double discount = product.getPrice() * (percentage/100);
        double newPrice = product.getPrice() - discount;
        product.setPrice(newPrice);
        System.out.println("New price for product " + product.getName() + " : " +newPrice);
    }
}
