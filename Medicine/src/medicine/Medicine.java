/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicine;

public class Medicine implements MedicAble {

    private int medicId;
    private String name;
    private String[] ingredients;
    String medicLable = "medicProperties";
    private String warning;

    public Medicine() {
    }

    public Medicine(int medicId, String name, String[] ingredients, String medicLable, String warning) {
        this.medicId = medicId;
        this.name = name;
        this.ingredients = ingredients;
        this.medicLable = medicLable;
        this.warning = warning;
    }

    public String getMedicLable() {
        return medicLable;
    }

    public void setMedicLable(String medicLable) {
        this.medicLable = medicLable;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public int getMedicId() {
        return medicId;
    }

    public void setMedicId(int medicId) {
        this.medicId = medicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String medicProperties() {
        return medicLable;
    }

    @Override
    public String[] medicIngredients() {
        return ingredients;
    }

    @Override
    public String medicWarning() {
        return warning;
    }

    @Override
    public String toString() {
        String pIngradients = "";
        for (String ingredient : ingredients) {
            pIngradients += ingredient + " ";
        }
        return "Medicine{" + "medicId=" + medicId + ", name=" + name + ", ingredients=" + pIngradients + '}';
    }

}
