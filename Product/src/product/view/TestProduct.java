package product.view;

import product.model.*;

public class TestProduct {

    public static void main(String[] args) {
        Food pd1 = new Food("sweet", "bow", 75, "pun", 123435);
        System.out.println(pd1);
        System.out.println("TotalPrice Food : " + pd1.TotalPrice());

        Beverage bvr1 = new Beverage("cold", 60, "tea", 134436);
        Beverage bvr2 = new Beverage("hot", 60, "tea", 134436);
        Food f1 = new Food("sweet", "bow", 50, "padthai", 100200L);
        Food f2 = new Food("sweet", "bow", 50, "padthai", 100200L);
        System.out.println(bvr1);
        System.out.println("TotalPrice Beverage : " + bvr1.TotalPrice());

        Toy toy1 = new Toy(8, "Red", 25, "car", 56456452);
        System.out.println(toy1);
        System.out.println("TotalPrice Toy : " + toy1.TotalPrice());

        if (bvr1.equals(bvr2)) {
            System.out.println("same beverage ");
        } else {
            System.out.println("different beverage ");
        }

        if (f1.equals(f2)) {
            System.out.println("same beverage ");
        } else {
            System.out.println("different beverage ");
        }
    }

}
