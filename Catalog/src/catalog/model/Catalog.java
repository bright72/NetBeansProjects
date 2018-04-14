
package catalog.model;

public class Catalog {
    private String productId;
    private String productName;
    private String productCost;

    public Catalog() {
    }

    public Catalog(String productId, String productName, String productCost) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCost() {
        return productCost;
    }

    public void setProductCost(String productCost) {
        this.productCost = productCost;
    }

    @Override
    public String toString() {
        return "[Product's ID : " + productId + ", Product's name : " + productName + ", Product's cost :  " + productCost +" Baht ]";
    }
    
    
}
