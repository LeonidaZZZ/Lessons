package Lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        int ff = 762;
//        if (ff > 0) {
//            System.out.println("Положительное число");
//        } else if (ff < 0) {
//            System.out.println("Отрицательное число");
//        }
//
//        if (ff < 10) {
//            System.out.println("Однозначное число");
//
//        } else if (ff >= 10) {
//            System.out.println("Двухзначное число");
//        }
//
//
//        int a = 6;
//        int b = 6;
//        int c = 10;
//
//        if ((a + b > c) && (c + b > a) && (a + c > b)) {
//            System.out.println("Треугольник существует");
//        } else {
//            System.out.println("Треугольник не существует");
//        }
//
//        int n = -1;
//        if (n < 0) {
//            n = n - 2;
//        } else if (n > 0) {
//            n = n + 1;
//        } else {
//            n = 10;
//        }
//        System.out.println(n);
//
//        int y = 1;
//        int x = 1;
//        int z = -1;
//        int countPos = 0;
//        int countNeg = 0;
//        if (y > 0) {
//            countPos++;
//        } else if (y != 0) {
//            countNeg++;
//        }
//        if (x > 0) {
//            countPos++;
//        } else if (x != 0) {
//            countNeg++;
//        }
//        if (z > 0) {
//            countPos++;
//        } else if (z != 0) {
//            countNeg++;
//        }
//        System.out.println("Положительных " + countPos + " Отрицательных" + countNeg);
//
//        if (y > x) {
//            System.out.println(y + " Большое чилос ");
//        } else if (y == x) {
//            System.out.println("Числа равны");
//        } else {
//            System.out.println(x + " Большое число ");
//        }
//        int countProgramer = 53;
//        if (countProgramer % 100 / 10 == 1) {
//            System.out.println(countProgramer + " Программистов ");
//        } else {
//            switch (countProgramer % 10) {
//                case 1:
//                    System.out.println(countProgramer + " Программист ");
//                    break;
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println(countProgramer + " Программиста ");
//                    break;
//                default:
//                    System.out.println(countProgramer + " Программистов ");
//            }
//
//
//        }
//        int nn = 5;
//        if (nn % 2 == 0) {
//            System.out.println("Число четное");
//
//        } else {
//            System.out.println("Число нечетное");
//
//        }
//        if (nn > 10 && nn < 50) {
//            System.out.println("ок");
//
//        } else {
//            System.out.println("не ок");
//
//        }
//
//        switch (nn) {
//            case 1:
//                System.out.println("Понеделдьник");
//                break;
//            case 2:
//                System.out.println("Вторник");
//                break;
//            case 3:
//                System.out.println("Среда");
//                break;
//            case 4:
//                System.out.println("Четверг");
//                break;
//            default:
//                System.out.println("хер его знает что за день");
//        }
//        int i = 10;
//        while (i >= 0) {
//            System.out.println(i);
//            i--;
//
//        }
//
//        do {
//            System.out.println(i);
//            i--;
//        } while (i > 0);
//
//
//        for (int df = 0; df < 10; df--) {
//            System.out.println(df);
//        }
//        int p = 0;
//        boolean isStop = true;
//        while (isStop) {
//            System.out.println(x);
//            if (x == 10) {
//                isStop = false;
//            }
//            p++;
//        }
//
//        for (int j = 0; j < 10; j++) {
//            for (int k = 0; k < 10; k++) {
//
//            }
//        }
//        int i1 = 10;
//        int i2 = 3;
//        double result = (double) i1 / (double) i2;
//        System.out.println(result);
//
//        int gg = 142678;
//        int countR = 0;
//        while (gg > 0) {
//            gg = gg / 10;
//            countR++;
//        }
//        System.out.println(countR);

//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.print(j * i +"\t" );
//            }
//            System.out.println("");
//
//
//        }
//        int bb = 1;
//        for (int i = 0; i <20 ; i++) {
//            bb = bb * 2;
//            System.out.print(bb + " ");

//        for (int i = 0; i < 10; i=i+2){
//            System.out.println(i +" ");
//
//        System.out.println(" Задание 1 ");
//
//
//        int[] array;
//        int bb = 0;
//
//
//        for (int i = 0; i < 20; i++) {
//            if (i % 2 == 0) {
//                bb++;
//            }
//
//
//        }
//        System.out.println(bb);
//
//
//        array = new int[bb];
//        int m = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = m;
//
//            m = m + 2;
//
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i] + " ");
//        }
//        System.out.println();
//
//
//        System.out.println(" Задача №2 ");
//
//        int size = 0;
//        int[] arr;
//        for (int i = 1; i < 100; i++) {
//            if (i % 2 != 0) {
//                size++;
//            }
//
//
//        }
//        System.out.println(size);
//        arr = new int[size];
//        int v = 1;
//        for (int i = 0; i < arr.length; i++) {
//
//            arr[i] = v;
//
//
//            v = v + 2;
//
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//        for (int i = arr.length - 1; i > 0; i--) {
//
//            System.out.print(arr[i] + " ");
//
//
//        }
//        System.out.println();
//
//
//        System.out.println(" Задача 3 ");     //Задача 3
//
//        int[] ark = new int[15];
//        Random rnd = new Random();
//        for (int i = 0; i < ark.length; i++) {
//            ark[i] = rnd.nextInt(99);
//
//
//        }
//        System.out.println(Arrays.toString(ark));
//
//
//        int is = 0;
//        int it = ark[0];
//        for (int i = 0; i < ark.length; i++) {
//            if (it < ark[i]) ;
//
//            it = ark[i];
//            is = i;
//
//        }
//        System.out.println(it + " " + is);
//
//
//        System.out.println(" Задача 4 ");     // Задача 4
//
//
//        int[] ara = new int[20];
//        Random rnm = new Random();
//        for (int i = 0; i < ara.length; i++) {
//            ara[i] = rnm.nextInt(20);
//
//        }
//        System.out.println(Arrays.toString(ara));
//
//        for (int i = 0; i < ara.length; i++) {
//            if (i % 2 != 0) {
//                ara[i] = 0;
//
//            }
//            System.out.print(ara[i] + " ");
//
//
//        }
//        System.out.println();
//
//
//        System.out.println("Задача 5");     // Задача 5
//
//        int[] arb = new int[5];
//        int[] are = new int[5];
//        Random rnn = new Random();
//
//        for (int i = 0; i < 5; i++) {
//            arb[i] = rnn.nextInt(15);
//            are[i] = rnn.nextInt(15);
//
//
//        }
//        System.out.println(Arrays.toString(arb));
//        System.out.println(Arrays.toString(are));
//
//
//        double avg1 = 0;
//        double avg2 = 0;
//        double result1 = 0;
//        double result2 = 0;
//        for (int i = 0; i < arb.length; i++) {
//            result1 = arb[i] + result1;
//
//
//        }
//        System.out.println(result1 + " Сумма всех элементов 1-го массива ");
//        avg1 = result1 / 5;
//        System.out.println(avg1 + " Среднее арифметическое 1 массива ");
//
//        for (int i = 0; i < are.length; i++) {
//            result2 = are[i] + result2;
//
//        }
//        System.out.println(result2 + " Сумма всех элементов 2-го массива ");
//        avg2 = result2 / 5;
//        System.out.println(avg2 + " Среднее арифметическое 2 массива ");
//
//        if (avg2 < avg1) {
//
//            System.out.println(" Среднее арифметическое Второго массива меньше среднего арифметического Первого массива ");
//        } else if (avg1 < avg2) {
//            System.out.println(" Среднее арифметическое Первого массива меньше среднего арифметического Второго массива ");
//        } else {
//            System.out.println(" Среднее арифметическое равны друг другу ");
//
//        }
//        System.out.println();
//
//        System.out.println(" Задача 6 ");       // Задача 6
//
//
//        int[] ass = new int[12];
//        Random ran = new Random();
//        for (int i = 0; i < ass.length; i++) {
//            ass[i] = ran.nextInt(15);
//        }
//
//        int max = 0;
//        int ind = 0;
//        for (int i = 0; i < ass.length; i++) {
//
//            if (max < ass[i]) {
//                max = ass[i];
//                ind = i;
//
//
//            }
//
//
//        }
//        System.out.println(Arrays.toString(ass));
//        System.out.println(" Индекс Максимального элемента " + ind);
//
////
//        System.out.println(" Задача 7 ");            // Задача 7
//
//        int[] mas7 = new int[10];
//        Random rdn = new Random();
//        for (int i = 0; i < mas7.length; i++) {
//            mas7[i] = rdn.nextInt(10);
//
//
//        }
//        boolean IsStop = false;
//        String str7 = " Элементы различны ";
//        System.out.println(Arrays.toString(mas7));
//        for (int i = 0; i < mas7.length; i++) {
//            for (int i1 = mas7.length - 1; i1 > i; i1--) {
//                if (mas7[i] == mas7[i1]) {
//                    IsStop = true;
//                    str7 = " Элементы Равны ";
//                    break;
//                }
//            }
//            if (IsStop) {
//                break;
//            }
//
//        }
//        System.out.println(str7);
//
//        System.out.println(" Задача 8 ");       // Задача 8
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Введите любое положительное число ");
//        int numb = scan.nextInt();
//        System.out.println(" Вы ввели число " + numb);
//
//        int[] mas8 = new int[12];
//        Random rnd8 = new Random();
//        for (int i = 0; i < mas8.length; i++) {
//            mas8[i] = rnd8.nextInt(15);
//
//
//        }


        System.out.println("Крестики нолики");


        //Кресики нолки

        Scanner games = new Scanner(System.in);
        String[][] game = new String[3][3];
        for (int i = 0; i < game.length; i++) {
            for (int i1 = 0; i1 < game.length; i1++) {
                game[i][i1] = "#";

            }

        }
        int x;
        int y;
        System.out.println(" Игра началась ");
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println(" Игрок №1 ваш ход");
            x = games.nextInt();
            y = games.nextInt();
            while (true) {
                if (x < game.length && y < game.length && game[x][y] == "#") {
                    game[x][y] = "x";
                    break;
                } else {
                    System.out.println(" Не верный ход, повторите попытку ");
                    x = games.nextInt();
                    y = games.nextInt();
                }


            }
            for (int i = 0; i < game.length; i++) {
                for (int i1 = 0; i1 < game.length; i1++) {
                    System.out.print(game[i][i1] + " ");
                }
                System.out.println();

            }
            gameOver = true;
            for (int i = 0; i < game.length; i++) {
                for (int i1 = 0; i1 < game.length; i1++) {
                    if (game[i][i1] == "#") ;
                    {
                        gameOver = false;
                        break;
                    }

                }
                if (!gameOver) {
                    break;
                }

            }
            if (gameOver) {
                System.out.println(" Ничья !");
                break;
            }
            for (int i = 0, j = 0; i < game.length; i++) {
                if (game[i][j] == game[i][j + 1] && game[i][j] == game[i][j + 2] && game[i][j] != "#") {
                    System.out.println("Победа!");
                    gameOver = true;
                    break;

                }
                if (game[j][i] == game[j + 1][i] && game[j][i] == game[j + 2][i] && game[j][i] != "#") {
                    System.out.println("Победа!");
                    gameOver = true;
                    break;

                }


            }
            if (gameOver) {
                break;
            }
            String[] sDiag = new String[game.length];

            for (int i = 0; i < game.length; i++) {
                for (int j = game.length - 1 - i; j <= i; j--) {
                    sDiag[i] = game[i][j];
                    break;
                }

            }

                if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#") {
                    System.out.println("Победа!");
                    break;
                }

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game.length; j++) {
                    if(i == j){
                        sDiag[i] = game[i][j];
                    }

                }

            }if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#") {
                System.out.println("Победа!");
                break;
            }

            System.out.println(" Игрок №2 ваш ход");

            x = games.nextInt();
            y = games.nextInt();
            while (true) {
                if (x < game.length && y < game.length && game[x][y] == "#") {
                    game[x][y] = "о";
                    break;
                } else {
                    System.out.println(" Не верный ход, повторите попытку ");
                    x = games.nextInt();
                    y = games.nextInt();
                }


            }


            for (int i = 0; i < game.length; i++) {
                for (int i1 = 0; i1 < game.length; i1++) {
                    System.out.print(game[i][i1] + " ");
                }
                System.out.println();

            }
            gameOver = true;
            for (int i = 0; i < game.length; i++) {
                for (int i1 = 0; i1 < game.length; i1++) {
                    if (game[i][i1] == "#") ;
                    {
                        gameOver = false;
                        break;
                    }

                }
                if (!gameOver) {
                    break;
                }

            }
            if (gameOver) {
                System.out.println(" Ничья !");
                break;
            }
            for (int i = 0, j = 0; i < game.length; i++) {
                if (game[i][j] == game[i][j + 1] && game[i][j] == game[i][j + 2] && game[i][j] != "#") {
                    System.out.println("Победа!");
                    gameOver = true;
                    break;

                }
                if (game[j][i] == game[j + 1][i] && game[j][i] == game[j + 2][i] && game[j][i] != "#") {
                    System.out.println("Победа!");
                    gameOver = true;
                    break;

                }


            }
            if (gameOver) {
                break;
            }


            for (int i = 0; i < game.length; i++) {
                for (int j = game.length - 1 - i; j <= i; j--) {
                    sDiag[i] = game[i][j];
                    break;
                }

            }

            if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#") {
                System.out.println("Победа!");
                break;
            }

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game.length; j++) {
                    if(i == j){
                        sDiag[i] = game[i][j];
                    }

                }

            }if (sDiag[0] == sDiag[1] && sDiag[0] == sDiag[2] && sDiag[0] != "#") {
                System.out.println("Победа!");
                break;
            }



        }


    }
}














