
package product.view;


import product.model.*;



public class TestProduct {
    public static void main(String[] args) {
        Food pd1 = new Food("sweet","bow",75,"pun",123435);
        System.out.println(pd1);
        System.out.println("TotalPrice Food : "+ pd1.TotalPrice());
        
        Beverage bvr1 = new Beverage("cold",60,"tea",134436);
        System.out.println(bvr1);
        System.out.println("TotalPrice Beverage : "+ bvr1.TotalPrice());
        
        Toy toy1 = new Toy(8,"Red",25,"car",56456452);
        System.out.println(toy1);
        System.out.println("TotalPrice Toy : "+  toy1.TotalPrice());
        
    }
  
}
