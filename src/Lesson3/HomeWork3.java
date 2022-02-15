package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {


//        System.out.println("Задача 1");               // Задача 1
//
//        int[] array;
//        int res = 0;
//
//        for (int i = 1; i <= 20; i++) {
//            if (i % 2 == 0) {
//                res++;
//            }
//
//        }
//        array = new int[res];
//        int g = 2;
//
//        for (int i = 0; i < array.length; i++) {
//
//            array[i] = g;
//            g = g + 2;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//
//            System.out.println(array[i] + " ");
//        }
//
//
//        System.out.println();
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//
//        }
//        System.out.println();
//
//        System.out.println(" Задача 2");          // Задача 2
//
//        int size = 0;
//        int[] arr;
//
//        for (int i = 1; i < 100; i++) {
//
//            if (i % 2 != 0) {
//
//                size++;                    // вычеслили длину массива
//            }
//
//
//        }
//
//        System.out.println(size);
//
//
//        arr = new int[size];
//        int p = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = p;
//
//            p = p + 2;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//
//        System.out.println();
//
//        for (int i = arr.length - 1; i > 0; i--) {
//
//
//            System.out.print(arr[i] + " ");
//
//        }
//
//        System.out.println();
//
//
//        System.out.println(" Задача 3");              // Задача 3
//
//
//        int[] ara = new int[15];
//        Random rnd = new Random();
//
//        for (int i = 0; i < ara.length; i++) {
//            ara[i] = rnd.nextInt(99);
//
//        }
//        System.out.println(Arrays.toString(ara));
//
//
//        int min = ara[0];
//        int index = 0;
//
//        for (int i = 0; i < ara.length; i++) {
//            if (min < ara[i]) {
//                min = ara[i];
//                index = i;
//            }
//
//        }
//        System.out.println(min + " " + index);
//
//        System.out.println();
//
//        System.out.println("Задача 4");           // Задача 4
//
//        int[] array4 = new int[20];
//        Random rnd4 = new Random();
//
//        for (int i = 0; i < array4.length; i++) {
//            array4 [i] = rnd4.nextInt(20);
//
//        }
//        System.out.println(Arrays.toString(array4));
//
//        System.out.println();
//
//        for (int i = 0; i < array4.length; i++) {
//            if(i % 2 != 0){
//                array4[i] = 0;
//            }
//
//        }
//        System.out.println(Arrays.toString(array4));
//
//        System.out.println();
//
//        System.out.println("Задача 5");             // Задача 5
//
//        int[] mas51 = new int[5];
//        int[] mas52 = new int[5];
//        Random rnd5 = new Random();
//
//        for (int i = 0; i < 5; i++) {
//            mas51[i] = rnd5.nextInt(15);
//            mas52[i] = rnd5.nextInt(15);
//        }
//        System.out.println(Arrays.toString(mas51));
//        System.out.println(Arrays.toString(mas52));
//
//        int avg51;
//        int avg52;
//        int calculatin51 = 0;
//        int calculatin52 = 0;
//
//        for (int i = 0; i < mas51.length; i++) {
//            calculatin51 = calculatin51 + mas51[i];
//        }
//        avg51 = calculatin51 / 5;
//        System.out.println(avg51);
//
//        for (int i = 0; i < mas52.length; i++) {
//            calculatin52 = calculatin52 + mas52[i];
//        }
//        avg52 = calculatin52 / 5;
//        System.out.println(avg52);
//
//        if (avg51 > avg52) {
//            System.out.println("Среднее арифметическое значение 1го массива больше");
//        } else if (avg51 == avg52) {
//            System.out.println("Средние фрифметические значений равны");
//        } else {
//            System.out.println("Среднее арифметическое 2го массива юольше");
//        }

//        System.out.println("Задача 6");           // Задача 6
//
//        int[] mas6 = new int[12];
//        Random rnd6 = new Random();
//
//        for (int i = 0; i < mas6.length; i++) {
//            mas6[i] = rnd6.nextInt(15);
//        }
//        System.out.println(Arrays.toString(mas6));
//
//        int pzm6 = 0;
//        int indexmas6 = 0;
//
//        for (int i = 0; i < mas6.length; i++) {
//
//
//            if(pzm6 < mas6[i]){
//                pzm6 = mas6[i];
//                indexmas6 = i;
//
//            }
//        }
//        System.out.println(pzm6 + " " + indexmas6);

//        System.out.println("Задача 7");                   // Задача 7
//
//        int[] mas7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
//        Random rnd7 = new Random();
//
//        for (int i = 0; i < mas7.length; i++) {
//            mas7[i] = rnd7.nextInt(9);
//        }
//        System.out.println(Arrays.toString(mas7));

//        Boolean isStop = false;
//        String str7 = "Элементы различны";
//
//        for (int i = 0; i < mas7.length; i++) {
//            for (int i1 = mas7.length - 1; i1 > i; i1--) {
//                if (mas7[i] == mas7[i1]) {
//                    isStop = true;
//                    str7 = "Элементы равны";
//                    break;
//                }
//
//            }
//            if (isStop) {
//
//                break;
//
//            }
//
//
//        }
//        System.out.println(str7);

        System.out.println("Задача 8");             // Задача 8

        Scanner scan8 = new Scanner(System.in);

        System.out.println("Введите положительное число");

        int num8 = scan8.nextInt();
        int[]array8;


        while (true) {

            if (num8 < 0 || num8 == 0) {
                System.out.println("Вы ввели неверное число,попробуйте еще раз");
                scan8.next();
            }

            else {  array8 = new int[num8];
                Random rnd8 = new Random();
                for (int i = 0; i < array8.length; i++) {
                    array8[i] = rnd8.nextInt(15);
                }
                System.out.println(Arrays.toString(array8));
                break;


            }


        }
    }

}
