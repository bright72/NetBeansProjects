/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2;

import java.util.*;

/**
 *
 * @author harit
 */
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x [] = new int[6];
        for (int i = 0; i < 6; i++) {
            x[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(revertArray(x)));
    }
    
    public static int[] revertArray(int x[]){
        String output = "";
        int revert[];
        revert = new int [x.length];
        for (int i = 0; i < x.length; i++) {
            revert[x.length-i-1] = x[i]  ;
        }
    return revert;

    }
}
