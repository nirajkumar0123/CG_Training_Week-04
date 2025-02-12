package smartwarehousemanagementsystem;

import java.util.List;

class WarehouseUtil {
    public static void displayAllItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println(item);
        }
    }
}
