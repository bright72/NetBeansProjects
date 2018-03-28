
package carrentapp;


public class CarRentApp {

  
    public static void main(String[] args) {
        Customer cust = new Customer("Ava", "Olivia");
Car[] cars = new Car[2];
cars[0] = new Car("AB-4357", 80);
cars[1] = new Car("ZV-2343", 120);
Rental[] rent = new Rental[2];
rent[0] = new Rental(cust, cars[0], 10);
rent[0].addHours(2);
rent[1] = new Rental(cust, cars[1], 5);

System.out.println(rent[0].toString());
System.out.println(rent[1].toString());
    }
    
}
