/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import sit.model.*;

/**
 *
 * @author harit
 */
public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "pun", 50000);
        System.out.println(emp1);
        System.out.println("pay for pun" + emp1.pay());

        Manager mng1 = new Manager(12000, 2, "punpun", 100000);
        System.out.println(mng1);
        mng1.setEmpId("EMG-00023");
        System.out.println("pay for pun" + mng1.pay());
        
       
        mng1.setEmpId("EMG-00023");
          System.out.println(mng1.toString()); 
    }

}
