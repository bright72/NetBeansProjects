/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self5;

/**
 *
 * @author harit
 */
public class Student {
 String std [];
    private String name[] = new String[]{"bright","pee","mook","tee"};
 int height[] = new int[]{188,195,170,150};
int  weight [] = new int [] {56,78,34,67};

    public Student() {
        
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getHeight() {
        return height;
    }

    public void setHeight(int[] height) {
        this.height = height;
    }

    public int[] getWeight() {
        return weight;
    }

    public void setWeight(int[] weight) {
        this.weight = weight;
    }

    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", height=" + height + ", weight=" + weight + '}';
    }
    
    
}
