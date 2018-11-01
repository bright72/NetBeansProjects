/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author harit
 */
public class circle {
    private double radius;
    private final double PIE = 22/7;

    public circle() {
    }

    public circle(double radius) {
        this.radius = radius;
    }
    

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    
    public double getArea(double radius){
       double result;
    this.radius = radius;
       result = PIE * Math.pow(this.radius,2);
    return result;
    }

    @Override
    public String toString() {
        return "circle" + "radius=" + radius + ", PIE=" + PIE + '}';
    }
    
    
}
