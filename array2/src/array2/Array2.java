
package array2;


public class Array2 {

    
    public static void main(String[] args) {
        int[] set2 = {5,7,5,6,7,8,9};
        int[] set1 = {5,7,5,6,7,7,9}; 
        System.out.println(checkNumber(set1,set2));
    }
    public static String checkNumber(int[] set1,int[] set2){
    int same = 0;
    int notsame = 0;
        for (int i = 0; i < set1.length; i++) {
            if(set1[i] == set2[i]){
            same++;
            }
            else{
            notsame++;
            }
        }
    String output = " indentity : " + same + " not identity : "+ notsame;
    return output;
    }
    
}
