/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

/**
 *
 * @author harit
 */
public class Weapon {
    private String name;
    private int power;

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

   public int getPower(){
   return this.power;
   
   }

    @Override
    public String toString() {
        return "Weapon{" + "name=" + name + ", power=" + power + '}';
    }
   
    
}
