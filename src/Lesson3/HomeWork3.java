package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {


        System.out.println("Задача 1");               // Задача 1

        int[] array;
        int res = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                res++;
            }

        }
        array = new int[res];
        int g = 2;

        for (int i = 0; i < array.length; i++) {

            array[i] = g;
            g = g + 2;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }


        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
        System.out.println();
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
//            if (min > ara[i]) {
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
//            System.out.println("Средние арифметические значений равны");
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
//
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
//                break;
//            }
//        }
//        System.out.println(str7);

//        System.out.println("Задача 8");             // Задача 8
//
//        Scanner scan8 = new Scanner(System.in);
//
//        System.out.println("Введите четное положительное число");
//
//        int num8 = scan8.nextInt();
//        int[] array8;
//
//
//        while (num8 <= 0 || num8 % 2 != 0) {
//
//            System.out.println("Вы ввели не верное числою Попробуйте ещё раз");
//            num8 = scan8.nextInt();
//        }
//
//        array8 = new int[num8];
//        Random rnd8 = new Random();
//
//        for (int i = 0; i < array8.length; i++) {
//            array8[i] = rnd8.nextInt(15);
//        }
//        System.out.println(Arrays.toString(array8));
//
//        int summLeft = 0;
//        int summRight = 0;
//
//        for (int i = 0; i < array8.length; i++) {
//            if(i < array8.length / 2){
//                summLeft = summLeft + array8[i];
//            }
//            else{ summRight = summRight + array8[i];
//
//            }
//        }
//        if(summLeft > summRight){
//            System.out.println("Сумма левой половины массива больше");
//        }
//        else if (summLeft == summRight){
//            System.out.println("Суммы половин массива равны");
//        }
//        else {
//            System.out.println("Сумма правой половины массива больше");
//        }

//        System.out.println("Задача 9");             // Крестиеи нолики  //
//
//
//        Scanner scan9 = new Scanner(System.in);
//
//
//        String[][] game = new String[3][3];
//        for (int i = 0; i < game.length; i++) {
//            for (int i1 = 0; i1 < game.length; i1++) {
//                game[i][i1] = "#";
//            }
//        }
//
//        int x;
//        int y;
//
//        System.out.println("Игра началась");            // от 0 до 2 через Enter
//        Boolean gameOwer = false;
//        while (!gameOwer) {
//            System.out.println("Игрок 1 ваш ход");
//            x = scan9.nextInt();
//            y = scan9.nextInt();
//            while (true) {
//                if (game[x][y] == "#") {
//                    game[x][y] = "x";
//                    break;
//                } else {
//                    System.out.println("Не верный ход. Ходите снова");
//                    x = scan9.nextInt();
//                    y = scan9.nextInt();
//                }
//            }
//            for (int i = 0; i < game.length; i++) {
//                for (int i1 = 0; i1 < game.length; i1++) {
//                    System.out.print(game[i][i1]);
//                }
//                System.out.println();
//            }
//            gameOwer = true;
//            for (int i = 0; i < game.length; i++) {
//                for (int i1 = 0; i1 < game.length; i1++) {
//                    if (game[i][i1] == "#") {
//                        gameOwer = false;
//                        break;
//                    }
//                }
//                if (!gameOwer) {
//                    break;
//                }
//            }
//            if (gameOwer) {
//                System.out.println("Ничья");
//                break;
//            }
//
//            for (int i = 0, j = 0; i < game.length; i++) {
//
//                if (game[i][j] == game[i][j + 1] && game[i][j] == game[i][j + 2] && game[i][j] != "#") {
//
//                    System.out.println("Win");
//                    gameOwer = true;
//                    break;
//                }
//                if (game[j][i] == game[j + 1][i] && game[j][i] == game[j + 2][i] && game[j][i] != "#"){
//
//                    System.out.println("Win");
//                    gameOwer = true;
//                    break;
//                }
//
//            }
//            if(gameOwer){
//                break;
//            }
//
//            String[] sDiag = new String[game.length];
//
//            for (int i = 0; i < game.length; i++) {
//                for (int j = game.length - 1 - i; j <= i; j--) {
//
//                    sDiag[i] = game[i][j];
//                    break;
//                }
//            }
//            if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#"){
//                System.out.println("Win");
//                break;
//            }
//
//            for (int i = 0; i < game.length; i++) {
//                for (int j = 0; j < game.length; j++) {
//
//                   if (i == j){
//                       sDiag[i] = game[i][j];
//                   }
//                }
//            }
//            if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#"){
//                System.out.println("Win");
//                break;
//            }
//
//
//            System.out.println("Ход игрока 2");
//
//
//            x = scan9.nextInt();
//            y = scan9.nextInt();
//            while (true) {
//                if (game[x][y] == "#") {
//                    game[x][y] = "O";
//                    break;
//                } else {
//                    System.out.println("Не верный ход. Ходите снова");
//                    x = scan9.nextInt();
//                    y = scan9.nextInt();
//                }
//            }
//            for (int i = 0; i < game.length; i++) {
//                for (int i1 = 0; i1 < game.length; i1++) {
//                    System.out.print(game[i][i1]);
//                }
//                System.out.println();
//            }
//            gameOwer = true;
//            for (int i = 0; i < game.length; i++) {
//                for (int i1 = 0; i1 < game.length; i1++) {
//                    if (game[i][i1] == "#") {
//                        gameOwer = false;
//                        break;
//                    }
//                }
//                if (!gameOwer) {
//                    break;
//                }
//            }
//            if (gameOwer) {
//                System.out.println("Ничья");
//                break;
//            }
//
//            for (int i = 0, j = 0; i < game.length; i++) {
//
//                if (game[i][j] == game[i][j + 1] && game[i][j] == game[i][j + 2] && game[i][j] != "#") {
//
//                    System.out.println("Win");
//                    gameOwer = true;
//                    break;
//                }
//                if (game[j][i] == game[j + 1][i] && game[j][i] == game[j + 2][i] && game[j][i] != "#"){
//
//                    System.out.println("Win");
//                    gameOwer = true;
//                    break;
//                }
//
//            }
//            if(gameOwer){
//                break;
//            }
//
//            for (int i = 0; i < game.length; i++) {
//                for (int j = game.length - 1 - i; j <= i; j--) {
//
//                    sDiag[i] = game[i][j];
//                    break;
//                }
//            }
//            if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#"){
//                System.out.println("Win");
//                break;
//            }
//
//            for (int i = 0; i < game.length; i++) {
//                for (int j = 0; j < game.length; j++) {
//
//                    if (i == j){
//                        sDiag[i] = game[i][j];
//                    }
//                }
//            }
//            if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#"){
//                System.out.println("Win");
//                break;
//            }
//
//
//
//        }


    }

}
