package sit.model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harit
 */
public class Employee {

    private long empId;
    private String empName;
    protected double payRate;

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", empName=" + empName + ", payRate=" + payRate + '}';
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public Employee(long empId, String empName, double payRate) {
        this.empId = empId;
        this.empName = empName;
        this.payRate = payRate;
    }

    public double pay() {
        return payRate;
    }

    public Employee() {
    }
;
}
