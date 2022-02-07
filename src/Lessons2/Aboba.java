package Lessons2;

public class Aboba {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");

        int pp = 10000000;

        int br = 14;
        int dh = 8;
        int dif = br - dh;
        for (int i = 1; i <= 10; i++) {
            pp = pp + pp * dif / 1000;


        }
        System.out.println(pp);

        System.out.println(" Задача 2");

        int y = 1;
        int x = 1;
        int z;
        {
            System.out.print(y + " " + x + " ");
        }
        for (int i = 3; i <= 11; i++) {
            z = y + x;
            System.out.print(+z + " ");
            x = y;
            y = z;

        }
        System.out.println();


        System.out.println(" Упражнение 3 ");

        int n = 7;
        int nn;
        for (int i = 1; i <=n; i++) {
            n = n * i;
            System.out.println(n);






    }


}}


