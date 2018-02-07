
package sit.model;


public class Manager extends Employee {
    private double positionAlloance;

    public double getPositionAlloance() {
        return positionAlloance;
    }

    public void setPositionAlloance(double positionAlloance) {
        this.positionAlloance = positionAlloance;
    }

    @Override
    public String toString() {
        return "Manager{" + "positionAlloance=" + positionAlloance + '}';
    }
    
    @Override
    public double  pay () {
    return payRate+positionAlloance; 
    }

    public Manager(double positionAlloance) {
        this.positionAlloance = positionAlloance;
    }
    
}
