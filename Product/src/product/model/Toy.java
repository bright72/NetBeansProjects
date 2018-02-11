
package product.model;

public class Toy extends Product {
    private int minimumAge;
    private String color;

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Toy{" + "minimumAge=" + minimumAge + ", color=" + color + '}';
    }
    
      @Override
    public double TotalPrice() {

        return price ;
    }

    public Toy(int minimumAge, String color, int price,  String productName, long productId) {
        super(price,productName, productId);
        this.minimumAge = minimumAge;
        this.color = color;
    }
}