/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author harit
 */
public class Sale extends Employee{
    private double commission;

    public Sale(double commission, int employeeId, String name, double salary) {
        super(employeeId, name, salary);
        this.commission = commission;
    }

    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "Sale{"+super.toString()+ "commission=" + commission +" Salary : "+getSalary()+ '}';
    }

    @Override
    public double getSalary() {
        return salary+commission;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sale other = (Sale) obj;
        if (Double.doubleToLongBits(this.commission) != Double.doubleToLongBits(other.commission)) {
            return false;
        }
        return true;
    }
    
}
