package product.model;

public class Beverage extends Product {

    private String type;

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TestProduct{" + "type=" + type + '}';
    }

    @Override
    public double TotalPrice() {
        price += price*10/100;
        return price;
    }

    public Beverage(String type, int price, String productName, long productId) {
        super(price, productName, productId);
        this.type = type;
    }
}
