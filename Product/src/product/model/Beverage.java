package product.model;

public class Beverage extends Product {

    private String type;

    public Beverage() {
        super();
    }
    
    public Beverage(String type, int price, String productName, long productId) {
        super(price, productName, productId);
        this.type = type;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TestProduct{"+ super.toString() + "type=" + type + '}';
    }

    @Override
    public double TotalPrice() {
        price += price*10/100;
        return price;
    }

    
    
     public boolean equals(Object obj) {
       
        Beverage temp = null;
        if (obj != null && obj instanceof Product) {
            temp = (Beverage) obj;
            if (productId == temp.productId && productName.equalsIgnoreCase(productName) ) {
                return true;
            }
        }
        return false;
    }
    
}
