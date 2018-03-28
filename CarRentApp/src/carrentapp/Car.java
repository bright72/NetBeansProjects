/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentapp;

/**
 *
 * @author harit
 */
public class Car {
    private String plate;
    private int price ;

    public Car() {
    }

    public Car(String plate, int price) {
        this.plate = plate;
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "plate=" + plate + ", price=" + price + '}';
    }
    
    
}
