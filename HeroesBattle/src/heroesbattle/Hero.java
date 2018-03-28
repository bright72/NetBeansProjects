/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;


public class Hero {

private String name ;
private int health ;
private Armor armor;
private Weapon weapon;

    public Hero() {
    }

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }
    public Hero(String name, int health, Armor armor){
        this.name = name;
        this.health = health;
        this.armor = armor;
        
    }
    public Hero(String name, int health ) {
        this.name = name;
        this.health = health;
     
    }
     public Hero(String name) {
        this.name = name;
  
  
    }
 

    public void changeArmor(Armor armor) {
        this.armor = armor;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

   public int getHealth(){
       return this.health;
   }
   
   public int getAttactPower(){

      return  this.weapon.getPower();
   }
   public void  attacted(int power){
       this.health=armor.getArmor()-power+health;
   }  
   public void attacted(Hero enemy){
     attacted(enemy.getAttactPower());
   }  
   
}
