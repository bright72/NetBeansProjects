package int107.hw4;

public class INT107HW4 {

    public static void main(String[] args) {
        
        System.out.println("Experiment with Java to find out how Java handle overflow and overflow with float type."+"\n"+"Floating Point Precision:");
        
        float myFloat;
        myFloat = 1.23456789f;
        System.out.println(myFloat);
        myFloat = 12.23456789f; 
        System.out.println(myFloat);
        
        System.out.println("Cancellation Error:");
        myFloat = 1 + 1.234e-5f - 1;
        System.out.println(myFloat);
        
        System.out.println("Float Overflow:");
        float highFloat;
        highFloat = Float.MAX_VALUE;
        highFloat = highFloat*2;
        System.out.println(highFloat);
        
        System.out.println("Float Underflow:");
        float lowFloat = Float.MIN_VALUE;
        lowFloat = lowFloat/2;
        System.out.println(lowFloat);
        
        System.out.println("Infinity/Nan:");
        //float divFloat1 = 1/0;
        //float divFloat2 = 0/0;
        
        //fix teacher code
        float divFloat1 = 1/1;
        float divFloat2 = 1/1;
        
        //change variable float to double
        double sqrtFloat = Math.sqrt(-1);
        System.out.println("value of divFloat1 is "+divFloat1+"value of divFloat2 is "+divFloat2+"value of sqrtFloat is "+sqrtFloat+"\n");
        if (Float.isNaN(divFloat1)){
            System.out.println("divFloat1 is NaN");
        }
        if (Float.isNaN(divFloat2)){
            System.out.println("divFloat2 is NaN");
        }
        if (Float.isNaN((float)sqrtFloat)){
            System.out.println("sqrtFloat is NaN");
        }
        
    }

}
