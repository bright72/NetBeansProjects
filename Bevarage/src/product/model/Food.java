package product.model;

public class Food extends Product {

    private String taste;
    private String container;

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public double TotalPrice() {
   price += price*10/100;
        return price ;
    }

    public Food(String taste, String container, int price, String productName, long productId) {
        super(price, productName, productId);
        this.taste = taste;
        this.container = container;
    }
}
