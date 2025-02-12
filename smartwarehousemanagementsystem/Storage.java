package smartwarehousemanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItems(T item) {
    items.add(item);
    }

    public List<T> getItem(){
        return items;
    }

    public void displayItems(){
        for(T item : items){
            System.out.println(item);
        }
    }
}
