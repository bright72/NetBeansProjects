package platform;

public class platform2 {

    public static void main(String[] args) {

        //ข้อ 1.
        System.out.println("Min value of Byte is " + Byte.MIN_VALUE
                + "\nMax value of Byte is " + Byte.MAX_VALUE);

        // ข้อ 2.
        byte A = Byte.MAX_VALUE;
        byte B = Byte.MIN_VALUE;
        byte newA =  (++A);
        byte newB =  (--B);

        System.out.println("New value of A " + newA + ", New value of B " + newB);

        //ข้อ 3.
        for (byte i = 0; i <= 149; i++) {
            System.out.println(i);
        }

    }
}
