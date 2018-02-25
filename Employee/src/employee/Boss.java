
package employee;


public class Boss extends Employee {
private double rate;

    public Boss(double rate, int employeeId, String name, double salary) {
        super(employeeId, name, salary);
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Boss{" + super.toString() +"rate=" + rate + " Salary : "+getSalary()+ '}';
    }

    @Override
    public double getSalary() {
        return salary*rate;
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
        final Boss other = (Boss) obj;
        if (Double.doubleToLongBits(this.rate) != Double.doubleToLongBits(other.rate)) {
            return false;
        }
        return true;
    }

}
