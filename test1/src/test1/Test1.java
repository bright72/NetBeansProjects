/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author harit
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        circle c1 = new circle(7.5);
        System.out.println(c1.getRadius());        
        System.out.println(c1.toString());
        
        double num1 = 60.98;
        double num2  = (int) num1;
        System.out.println(num2);
        
        String Phoneno = "0894195956";
        System.out.println(Phoneno.substring(0,9));
    }
    
    
    
    
}
