package Lesson1;

public class HomeWork {
    public static void main(String[] args) {
        int ff = 762;
        if (ff > 0) {
            System.out.println("Положительное число");
        } else if (ff < 0) {
            System.out.println("Отрицательное число");
        }

        if (ff < 10) {
            System.out.println("Однозначное число");

        } else if (ff >= 10) {
            System.out.println("Двухзначное число");
        }


        int a = 6;
        int b = 6;
        int c = 10;

        if ((a + b > c) && (c + b > a) && (a + c > b)) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }

        int n = -1;
        if (n < 0) {
            n = n - 2;
        } else if (n > 0) {
            n = n + 1;
        } else {
            n = 10;
        }
        System.out.println(n);

        int y = 1;
        int x = 1;
        int z = -1;
        int countPos = 0;
        int countNeg = 0;
        if (y > 0) {
            countPos++;
        } else if (y != 0) {
            countNeg++;
        }
        if (x > 0) {
            countPos++;
        } else if (x != 0) {
            countNeg++;
        }
        if (z > 0) {
            countPos++;
        } else if (z != 0) {
            countNeg++;
        }
        System.out.println("Положительных " + countPos + " Отрицательных" + countNeg);

        if (y > x) {
            System.out.println(y + " Большое чилос ");
        } else if (y == x) {
            System.out.println("Числа равны");
        } else {
            System.out.println(x + " Большое число ");
        }
    int countProgramer = 123;
        if (countProgramer % 100 / 10 == 1){
            System.out.println(countProgramer + " Программистов ");
        }else {
            switch (countProgramer % 10) {
                case 1:
                    System.out.println(countProgramer + " Программист ");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(countProgramer + " Программиста ");
                    break;
                default:
                    System.out.println(countProgramer + " Программистов ");
            }



        }






























        int i1 = 10;
        int i2 = 3;
        double  result = (double) i1 / (double) i2;
        System.out.println(result);

    }

}