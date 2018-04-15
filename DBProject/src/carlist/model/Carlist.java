/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlist.model;

/**
 *
 * @author harit
 */
public class Carlist {
    private String CarId;
    private String carBrand;
    private String carColour;
    private String carType;
    private double carPrice;
    private String carproblem;

    public Carlist() {
    }

    public Carlist(String CarId, String carBrand, String carColour, String carType, double carPrice, String carproblem) {
        this.CarId = CarId;
        this.carBrand = carBrand;
        this.carColour = carColour;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carproblem = carproblem;
    }

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String CarId) {
        this.CarId = CarId;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarproblem() {
        return carproblem;
    }

    public void setCarproblem(String carproblem) {
        this.carproblem = carproblem;
    }

    @Override
    public String toString() {
        return "Carlist{" + "CarId=" + CarId + ", carBrand=" + carBrand + ", carColour=" + carColour + ", carType=" + carType + ", carPrice=" + carPrice + ", carproblem=" + carproblem + '}';
    }

   
    
}
