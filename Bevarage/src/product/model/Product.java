package product.model;

public class Product {

    protected double price;
    private String productName;
    private long productId;

    public Product() {
    }

    public Product(int price, String productName, long productId) {
        this.price = price;
       
        this.productName = productName;
        this.productId = productId;
    }

    public Product(int i, String pun, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Product{" + "price=" + price +  ", productName=" + productName + ", productId=" + productId + '}';
    }

public double TotalPrice(){
return price;
} 
    

}
