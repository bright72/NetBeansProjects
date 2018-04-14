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
    private String carownerName;
    private String carBrand;
    private String carColour;
    private String carType;
    private double carPrice;
    private String carproblem;

    public Carlist() {
    }

    public Carlist(String carownerName, String carBrand, String carColour, String carType, double carPrice, String carproblem) {
        this.carownerName = carownerName;
        this.carBrand = carBrand;
        this.carColour = carColour;
        this.carType = carType;
        this.carPrice = carPrice;
        this.carproblem = carproblem;
    }

    public String getCarownerName() {
        return carownerName;
    }

    public void setCarownerName(String carownerName) {
        this.carownerName = carownerName;
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
        return "Carlist{" + "carownerName=" + carownerName + ", carBrand=" + carBrand + ", carColour=" + carColour + ", carType=" + carType + ", carPrice=" + carPrice + ", carproblem=" + carproblem + '}';
    }

    
}
