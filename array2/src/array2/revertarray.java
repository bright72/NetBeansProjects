package array2;

import java.util.Arrays;


public class revertarray {
    public static void main(String[] args) {
        String[] name = {"bright","zerron","budda","pee"};
        System.out.println(Arrays.toString(revertArray(name)));
    }
    public static String[] revertArray(String name[]){
        String output = "";
        String revert[];
        revert = new String [name.length];
        for (int i = 0; i < name.length; i++) {
            revert[name.length-i-1] = name[i]  ;
        }
    return revert;

    }
}
