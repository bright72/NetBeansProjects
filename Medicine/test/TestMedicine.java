/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harit
 */
import medicine.*;

public class TestMedicine {

    public static void main(String[] args) {
//        String inrgedients[] = {"A", "B", "C"};
//        Medicine  med;
//        
//        Medicine p1 = new Medicine(555 , "ABC",inrgedients,"Exame prevernt","DO not take over 2 time");
//        
//        
//        Medicine p2 = new Paracetamol (100 , 555, "ABC",inrgedients,"Exame check","DO not take over 2 time");
//   
//        med = p1;
//        System.out.println(med.getMedicLable());
//        med = new Paracetamol();
//        System.out.println(med.getMedicLable());
//    

Medicine m1 = new Medicine();
Medicine m2 = new Paracetamol();
        System.out.println(m1.medicProperties());
        System.out.println(m2.medicProperties());
        
    
    
    
    
    }
    
}
