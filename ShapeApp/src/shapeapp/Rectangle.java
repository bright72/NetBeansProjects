/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapeapp;

public class Rectangle extends Shape{
    private double width;
    private double lenght;

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public Rectangle(double width, double lenght, double area, double parameter) {
        super(area, parameter);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +super.toString()+ '}';
    }
    
    @Override
    public double getParameter(){
    double parameter = 2*(width*lenght);
    return parameter;
    }
    
      @Override
    public double getArea(){
    double area = width*lenght;
    return area;
    }
    
}
