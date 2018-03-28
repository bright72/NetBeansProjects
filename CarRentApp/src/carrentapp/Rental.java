/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentapp;


public class Rental {
    private Customer cust;
    private Car car;
    private int hour; 

    public Rental() {
    }

    public Rental(Customer cust, Car car, int hour) {
        this.cust = cust;
        this.car = car;
        this.hour = hour;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Rental{" + "cust=" + cust + ", car=" + car + ", hour=" + hour +" "+ Total()+'}';
    }

   
    public void addHours(int hour) {
        this.hour += hour  ;
        
    }
    
    public double Total(){
    return hour*car.getPrice();
    
    }
    
}
