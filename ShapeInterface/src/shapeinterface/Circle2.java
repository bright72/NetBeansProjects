package shapeinterface;  
public class Circle2 extends Circle{

    public Circle2(double radius) {
        super(radius);
    }

    public Circle2() {
    }
    
    @Override
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    //toString จะใส่หรือไม่ก็ได้เพราะสามารถดึงของพ่อมาได้
    
    
}