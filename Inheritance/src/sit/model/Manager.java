package sit.model;

public class Manager extends Employee {

    private double positionAlloance;
    
//shadowing
    private String empId;
    public double getPositionAlloance() {
        return positionAlloance;
    }

    public void setPositionAlloance(double positionAlloance) {
        this.positionAlloance = positionAlloance;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +"Manager Id :"+empId+ "positionAlloance=" + positionAlloance + '}';
    }

    public void setEmpId(String empId) {
        //subclass
        this.empId = empId;
    }

    @Override
    public double pay() {
        return payRate + positionAlloance;
    }

    public Manager(double positionAlloance, long empId, String empName, double payRate) {
        super(empId, empName, payRate);
        this.positionAlloance = positionAlloance;
    }

}
