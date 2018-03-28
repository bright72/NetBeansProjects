package self.model;

public class MemberCustomer extends Customer {

    private double points;
    private static double discountRate = 0.2;

    public MemberCustomer() {
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double redeemPoint2Cash(int usePoint) {
        double cash = 0;
        if (usePoint < 800 || usePoint > points) {
            System.out.println("Your points are not enough!");
            cash = -1;
        } else {
             cash = (usePoint / 800)*100;
           
            points = points - (cash*800/100);
        }
        return cash;
    }

    @Override
    public void addPointFromBuyingTotalPrice(double buying1Price) {
        int newpoint = (int) buying1Price / 25;
        points = points + newpoint;
    }

}
