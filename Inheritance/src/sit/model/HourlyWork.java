/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.model;

/**
 *
 * @author harit
 */
public class HourlyWork extends Employee {

    private double hourWork;

    @Override
    public String toString() {
        return "HourlyWork{" + "hourWork=" + hourWork + '}';
    }

    public double getHourWork() {
        return hourWork;
    }

    public void setHourWork(double hourWork) {
        this.hourWork = hourWork;
    }

    @Override
    public double pay() {
        return payRate * hourWork;
    }
}
