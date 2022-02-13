package Lesson4;

import java.util.Arrays;
import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {


        System.out.println(" Двумерные массивы");

        int[][] array1 = new int[3][3];             //двумерный массив

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[0].length; i1++) {
                array1[i][i1] = random.nextInt(10);
            }
        }

        System.out.println(Arrays.deepToString(array1));

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1[i].length; i1++) {
                System.out.print(array1[i][i1] + " ");
            }

            System.out.println();
        }


        for (int i = 0; i < array1.length; i++) {
            for (int i1 = array1.length - 1 - i; i1 >= 0; i1--) {

                System.out.print(array1[i][i1] + " ");
                break;

            }


        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array1.length; i1++) {
                if (i == i1) {
                    System.out.print(array1[i][i1] + " ");
                }

            }

        }

        System.out.println();


    }
}
