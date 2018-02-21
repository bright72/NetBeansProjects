
package shape;


public class Square extends Shape {
    private double side ;

    public Square() {
    }

    
    public Square(double side,String shapeId) {
        super(shapeId);
        this.side = side;
    }
    

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
     
    @Override
    public double getArea(){
    double result = side*side;
    return result;
    }
    
    @Override
    public double getPerimeter(){
    double result = side*side;
    return result;
    }
    

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
}
