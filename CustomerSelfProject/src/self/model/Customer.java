package self.model;


public abstract class Customer {
   private String name ,surname;

    public Customer() {
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
   
  
   public abstract double getDiscountRate();
   abstract void setDiscountRate(double discountRate);
   abstract double redeemPoint2Cash(int usePoint);
   abstract void addPointFromBuyingTotalPrice(double buying1Price);

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", surname=" + surname + '}';
    }
   
   
}
