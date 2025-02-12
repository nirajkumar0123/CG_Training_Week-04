package smartwarehousemanagementsystem;

public class WarehouseManager {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItems(new Electronics("Laptop"));
        electronicsStorage.addItems(new Electronics("Phone"));

        groceriesStorage.addItems(new Groceries("Milk"));
        groceriesStorage.addItems(new Groceries("Bread"));

        furnitureStorage.addItems(new Furniture("Chair"));
        furnitureStorage.addItems(new Furniture("Table"));

        System.out.println("Display individual items");
        electronicsStorage.displayItems();
        groceriesStorage.displayItems();
        furnitureStorage.displayItems();
        System.out.println("-------------------------------------");
        System.out.println("Display all items using wildcard");
        WarehouseUtil.displayAllItems(electronicsStorage.getItem());
        WarehouseUtil.displayAllItems(groceriesStorage.getItem());
        WarehouseUtil.displayAllItems(furnitureStorage.getItem());
    }
}
