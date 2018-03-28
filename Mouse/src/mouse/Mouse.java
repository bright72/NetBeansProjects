/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse;


public class Mouse {
private String color;

    public Mouse() {
    }

    public Mouse(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mouse{" + "color=" + color + '}';
    }
    
    public void  leftClick(){
            System.out.println("Click");
    
    }
    
    public void  rightClick(){
        System.out.println("Context Menu");
    }
    public void scoll(int scoll){
    if(scoll>=0){
        System.out.println("\"Up \" + scoll*3");
    }
    else{
        System.out.println("Down " + scoll*3);
    }
    
    }
}
