package arraytest;

import java.util.Scanner;

public class Arraytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] input = new int[]{4, 6, 7, 8, 9,6};
        Scanner  sc = new Scanner(System.in);
        System.out.println("firstindex : ");
        int firstindex = sc.nextInt();
         System.out.println("lastindex : ");
        int lastindex = sc.nextInt();
        
        System.out.println(calculateNumber(input,firstindex,lastindex));
    }

    public static int calculateNumber(int[] input,int firstindex,int lastindex) {
        int result = 0;   
        for (int i = firstindex; i <= lastindex; i++) {
        result += input[i];    
        }
        return result;
    }
}
