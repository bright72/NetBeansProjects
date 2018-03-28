/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeapp;

/**
 *
 * @author harit
 */
public class Circle extends Shape{
    private int radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, double area, double parameter) {
        super(area, parameter);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
    double area = Math.PI*Math.pow(radius,2);
    return area;
    }

    @Override
    public double getParameter(){
    double parameter = 2*Math.PI*radius;
    return parameter;
    }
    
    @Override
    public String toString() {
        return "Circle{" +super.toString()+ '}';
    }
    
    
}
