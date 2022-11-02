package AnimalRescue;

public class AnimalFood {
    String name;
    double price;
    int qty;
    boolean stockAvailability;

    public AnimalFood (String foodBrand, double foodPrice, int foodQty, boolean foodAvailableInStock){
        name = foodBrand;
        price = foodPrice;
        qty = foodQty;
        stockAvailability = foodAvailableInStock;
    }
}
