package dynamiconlinemarketplace;

class Product<T extends Category> {
    private final String name;
    private double price;
    private final T category;

    public Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){return price;}

    public T getCategory(){
        return category;
    }
    
    @Override
    public String toString(){
        return category.getName()+ "-" + name + " rs " + price;
    }
}
