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
public class WirelessMouse extends Mouse{
    private double frequency;

    public WirelessMouse() {
    }

    public WirelessMouse(double frequency) {
        this.frequency = frequency;
    }

    public WirelessMouse(String color,double frequency ) {
        super(color);
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "WirelessMouse{" + "frequency=" + frequency + '}';
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
