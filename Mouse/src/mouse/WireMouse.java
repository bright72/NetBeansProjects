package mouse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harit
 */
public class WireMouse extends Mouse{
    private double wirelenght;
    private String usetype;

    public WireMouse() {
    }
    

    public WireMouse(double wirelenght, String usetype) {
        this.wirelenght = wirelenght;
        this.usetype = usetype;
    }

    public WireMouse(String color,double wirelenght, String usetype ) {
        super(color);
        this.wirelenght = wirelenght;
        this.usetype = usetype;
    }

   

    public double getWirelenght() {
        return wirelenght;
    }

    public void setWirelenght(double wirelenght) {
        this.wirelenght = wirelenght;
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype;
    }

 

    @Override
    public String toString() {
        return "WireMouse{" + "wirelenght=" + wirelenght + ", usetype=" + usetype + '}';
    }
    
        
    @Override
    public void  leftClick(){
            System.out.println("Click");
    
    }
    
    @Override
    public void  rightClick(){
        System.out.println("Context Menu");
    }
    @Override
    public void scoll(int scoll){
    if(scoll>=0){
        System.out.println("\"Up \" + scoll*3");
    }
    else{
        System.out.println("Down " + scoll*3);
    }
    }
}
