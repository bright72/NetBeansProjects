
package shape;


public abstract class Triangle2 extends Triangle implements Comparable<Triangle2>{
   public double getParimeter(){
   return 3*getBase();
   } 
    
   @Override
    public int compareTo(Triangle2 o){
        return getShapeId().compareTo(o.getShapeId());
    }
}
