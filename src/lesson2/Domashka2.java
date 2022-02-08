package lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Domashka2 {
    public static void main(String[] args) {

//        System.out.println("ex 1");
//
//        int population = 10000000;
//        int born = 14;
//        int dead = 8;
//        int dif = born - dead;
//
//        for (int i = 1; i <= 10 ; i++) {
//            population = population + population / 1000 * dif;             //
//        }
//        System.out.println(population);
//
//        System.out.println("ex 2");
//
//        int x = 1;
//        int y = 1;
//        int z;
//        System.out.print(x + " " + y + " ");
//
//        for (int i = 3; i <= 11; i++) {
//            z = x + y;
//            System.out.print(z + " ");
//            x = y;
//            y = z;
//
//        }
//        System.out.println();
//
//        System.out.println("ex 3");
//
//        int fn = 5;
//        int n = 1;
//
//        for (int i = 1; i <= fn; i++) {
//
//            n = n * i;
//
//        }
//        System.out.println(n);            // 1 * 2 * 3 * 6 * 5

//
//        System.out.println("classwork1");
//
//        int count = 0;
//
//        for (int h = 0; h < 24; h++) {
//            for (int mm = 0; mm < 60; mm++) {           //  if 1 число hour = последнему числу минут && 1е число минут == последнему числу часов то выводим
//
//                if (h / 10 == mm % 10 && h % 10 == mm / 10) {
//
//                    count++;
//
////                    System.out.println(h + ":" + mm);
//                }
//
//
//            }
//
//        }
//        System.out.println(count);
//
//        System.out.println("cw 2");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите 2 числа");
//
//        int i = scan.nextInt();
//        int b = scan.nextInt();
//        int res = i + b;
//
//        System.out.println("Вы ввели число" + res);
//
//        System.out.println("cw w");
//
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        int i;
//        while (true) {
//            if (myScanner.hasNextInt()) {
//                i = myScanner.nextInt();
//                System.out.println("Вы ввели " + i);
//                break;
//            } else {
//                System.out.println("Попробуйте еще раз");
//                myScanner.next();
//            }
//        }


//        System.out.println("Массив");
//
//        int[] array;
//
//        int[] array = int[10];
//        array[0] = 92;
//        array[1] = 0;
//        array[2] = 45;

//        int i = array[2];
//        System.out.println(i);
//
//        System.out.println(array.length);
//
//
//
//
//        int[] ints = [23, 56, 123, 789];
//
//        System.out.println(ints.length);
//
//
//        int[] ints = {23, 56, 123, 789};
//
//        for (int j = 0; j < ints.length; j++) {
//            System.out.println(ints[j]);
//        }
//        String str = Arrays.toString(ints);
//        System.out.println(str);

//        System.out.println(Arrays.toString(ints));
//
//        for (int i = 0; i < ints.length; i++) {
//            for (int j = ints.length - 1; j > i; j--) {
//                if (ints[j - 1] > ints[j]){
//                    int tmp = ints[j - 1];
//                    ints[j - 1] = ints[j];
//                    ints[j] = tmp;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(ints));


//        Random random = new Random();
//
//        int i = random.nextInt(20);
//        System.out.println(i);
//
//
//        Random random = new Random();
//
//        int [] arr = new int[6];
//        for (int i1 = 0; i1 < arr.length; i1++) {
//            arr[i1] = random.nextInt(100);
//        }


//        System.out.println("Задача 1");
//
//        int[] array = new int[10];
//        Random rnd = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rnd.nextInt(30);
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//           if (array[i] % 2 == 0 && array[i]!= 0){
//               System.out.print(array[i] + " ");
//           }
//
//        }
//
//        System.out.println("Задача 2");
//
//        int[] array = new int[10];
//        Random rnd = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rnd.nextInt(30);
//        }
//        System.out.println(Arrays.toString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                array[i] = 0;
//
//            }
//
//
//        }
//        System.out.print(Arrays.toString(array));
//
//        System.out.println("Задача 4");
//
//        int[] array = new int[5];
//        Random rnd = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rnd.nextInt(10);
//        }
//        System.out.println(Arrays.toString(array));
//        double result = 0;
//        double count = 0;
//        double avg;
//
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) {
//                count++;
//                result = array[i] + result;
//            }
//        }
//        avg = result / count;
//        System.out.println(avg);


    }
}
