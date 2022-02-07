package lesson2;

public class Domashka2 {
    public static void main(String[] args) {

        System.out.println("ex 1");

        int p = 10000000;
        int b = 14;
        int d = 8;
        int dif = b - d;

        for (int i = 1; i <= 10 ; i++) {
            p = p + p / 1000 * dif;             //
        }
        System.out.println(p);

        System.out.println("ex 2");

        int x = 1;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");

        for (int i = 3; i <= 11; i++) {
            z = x + y;
            System.out.print(+z + " ");
            x = y;
            y = z;

        }
        System.out.println();

        System.out.println("ex 3");

        int fn = 7;
        int n;

        for (int i = 1; i <= fn; i++) {

            n = n * i;
            System.out.println(n);


        }





    }
}
