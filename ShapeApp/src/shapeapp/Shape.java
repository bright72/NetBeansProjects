
package shapeapp;


public abstract class Shape {
private double area;
private double parameter;

    public Shape() {
    }

    public Shape(double area, double parameter) {
        this.area = area;
        this.parameter = parameter;
    }


    public void setArea(double area) {
        this.area = area;
    }


    public void setParameter(double parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "Shape{" + "area=" + getArea() + ", parameter=" + getParameter();
    }

    public abstract double getArea();
    public abstract double getParameter();
    
}
