package int107.hw4;

public class INT107HW4 {

    public static void main(String[] args) {
        
        System.out.println("Experiment with Java to find out how Java handle overflow and overflow with float type."+"\n"+"--------------------------------Floating Point Precision----------------------------");
        
        float myFloat;
        myFloat = 1.23456789f;
        System.out.println(myFloat);
        myFloat = 12.23456789f; 
        System.out.println(myFloat);
        
        System.out.println("---------------------Cancellation Error-----------------------");
        myFloat = 1 + 1.234e-5f - 1;
        System.out.println(myFloat);
        
        System.out.println("------------------------Float Overflow-------------------------");
        float highFloat;
        highFloat = Float.MAX_VALUE;
        highFloat = highFloat*2;
        System.out.println(highFloat);
        
        System.out.println("-----------------------Float Underflow--------------------------");
        float lowFloat = Float.MIN_VALUE;
        System.out.println("before divide");
        System.out.println(lowFloat);
        System.out.println("-------------------------After divide---------------------------");
        lowFloat = lowFloat/2;
        System.out.println(lowFloat);
        
        System.out.println("Infinity/Nan:");
        float divFloat1 = (float)1/0;
        float divFloat2 = (float)0/0;
        float sqrtFloat = (float)Math.sqrt(-1);
        System.out.println((divFloat1 != divFloat1)+"\t"+Float.isNaN(divFloat1));
        System.out.println((divFloat2 != divFloat2)+"\t"+Float.isNaN(divFloat2));
        System.out.println((sqrtFloat != sqrtFloat)+"\t"+Float.isNaN(sqrtFloat));
        if (Float.isNaN(divFloat1)){
            System.out.println("divFloat1 is NaN");
        }
        else {
            System.out.println("divFloat1 is " + divFloat1);
        }
        if (Float.isNaN(divFloat2)){
            System.out.println("divFloat2 is " + divFloat2);
        }
        if (Float.isNaN((float)sqrtFloat)){
            System.out.println("sqrtFloat is "+sqrtFloat);
        }
        
    }

}
