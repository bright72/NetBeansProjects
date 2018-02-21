
package shape;


public abstract class  Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
    }

    
    public Triangle(double base, double height,String shapeId) {
        super(shapeId);
        this.base = base;
        this.height = height;
    }

    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    @Override
    public double getArea(){
       double result = (1d/2)*base*height;
    return result;
    
    }

    @Override
    public String toString() {
        return "Triangle{"+super.toString()+ "base=" + base + ", height=" + height + '}';
    }
    
}
