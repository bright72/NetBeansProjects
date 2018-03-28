/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitappstore;

/**
 *
 * @author harit
 */
public class Item {
    protected String appName ;
    protected String category ;
    private double price;
    private String orderBy;

    public Item() {
    }

    public Item(String appName, String category, double price, String orderBy) {
        this.appName = appName;
        this.category = category;
        this.price = price;
        this.orderBy = orderBy;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    
    abstract String getType();
    

    @Override
    public String toString() {
        return "Item{" + "appName=" + appName + ", category=" + category + ", price=" + price + ", orderBy=" + orderBy + '}';
    }
    
}
