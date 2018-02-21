package shape;

public abstract class Shape {

    private String shapeId;

    public Shape() {
    }

    public Shape(String shapeId) {
        this.shapeId = shapeId;
    }

    public String getShapeId() {
        return shapeId;
    }

    public void setShapeId(String shapeId) {
        this.shapeId = shapeId;
    }

    public abstract double getArea() ;
    
    public abstract double getPerimeter();

    
    
    @Override
    public String toString() {
        return "Shape{" + "shapeId=" + shapeId + '}';
    }

}
