package platform;

public class Platform {

    public static void main(String[] args) {

        //ข้อ 1.
        System.out.println("Min value of Byte is " + Byte.MIN_VALUE
                + "\nMax value of Byte is " + Byte.MAX_VALUE);

        // ข้อ 2.
        byte A = Byte.MAX_VALUE;
        byte B = Byte.MIN_VALUE;
        byte newA = (byte) (A++);
        byte newB = (byte) (B--);

        System.out.println("New value of A " + newA + ", New value of B " + newB);

        //ข้อ 3.
        byte result = 0;
        System.out.println("Start Loop at : " + result);
        byte min = (byte) 0;
        byte max = (byte) 149;
        for (byte i = 1; min != max;) {
            min = (byte) ((byte) min + i);
            result = (byte) min;
            System.out.println("Loop = " + result);
        }
        System.out.println("End last result = " + result);
    }
}
