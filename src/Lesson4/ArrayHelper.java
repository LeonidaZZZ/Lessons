package Lesson4;

import java.util.Random;

public class ArrayHelper {


    static void fill(int[][] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {

                array[i][i1] = rnd.nextInt(10);
            }
        }
    }
    
    
   static String toSttingArray(int[][]array){
        String str = "";
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array.length; i1++) {
                str = str + array[i][i1] + " ";
            }
            str = str + "\n";
        }
        return str;
    } 
    
    
    
}
