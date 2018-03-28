/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine;

/**
 *
 * @author harit
 */
public class Paracetamol extends Medicine {

    private int gram;
     String medicLable= "ParaProperties";
    
     public Paracetamol() {
      
    }

    public Paracetamol(int gram, int medicId, String name, String[] ingredients, String medicLable, String warning) {
        super(medicId, name, ingredients, medicLable, warning);
        this.gram = gram;
    }

    public String getmedicLable() {
        return medicLable;
    }

 

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

   
    public String medicProperties() {
        return "Para"+getMedicLable();
    }
    @Override
    public String[] medicIngredients() {
        return null;
    }

    @Override
    public String medicWarning() {
        return null;
    }

    @Override
    public String toString() {
        return  "Paracetamol{" + "size=" + gram + super.toString() + '}';
    }

}
