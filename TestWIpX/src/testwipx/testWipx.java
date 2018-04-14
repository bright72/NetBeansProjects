package testwipx;

import java.text.DecimalFormat;

public class testWipx {
    public static void main (String[] atgs) {
       DecimalFormat dc1 = new DecimalFormat("#.###");
       DecimalFormat dc2 = new DecimalFormat("0.000");
       double number = 10.300431353;
       
        System.out.println(number);
        System.out.println(dc1.format(number));
        System.out.println(dc2.format(number));
    }
}


