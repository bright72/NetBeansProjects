import employee.*;

public class TestEmployee {
    public static void main(String[] args) {
       Employee e1 = new Employee(300,"bright",500000);
        System.out.println(e1.toString());
        Employee e2 = new Employee(300,"bright",500000);
        System.out.println(e1.equals(e2));
   
    Sale s1 = new Sale(2500,300,"bright",500000);
        System.out.println(s1.toString());
    
        Boss b1 = new Boss(0.75,300,"bright",500000);
        System.out.println(b1.toString());
    }
}
