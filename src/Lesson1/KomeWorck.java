package Lesson1;

class HomeWork {
    public static void main(String[] args) {
        System.out.println("HomeWork exercise 1");

        int a = 20;

        if (a > 0 && a < 10) {
            System.out.println("число положительное однозначное");
        }
        if (a >= 10 && a < 100) {
            System.out.println("Число положительгое двузначное");
        }
        if (a < 0 && a > -10) {
            System.out.println("Число отрицательное однозначное");
        }
        if (a <= -10 && a > -100) {
            System.out.println("Число отрицательное двузначное");
        }
        System.out.println("Ex2");


        int q = 17;
        int b = 10;
        int c = 7;

        if (q + b >= c && q + c >= b && b + c >= q) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
        System.out.println("ex3");

        int a1 = 25;

        if (a1 > 0) {
            a1++;
        } else if (a1 < 0) {
            a1 = a1 - 2;
        } else {
            a1 = 10;

        }
        System.out.println(a1);

        System.out.println("ex4");

        int x = 1;
        int y = 24;
        int z = -18;

        int countPos = 0;
        int countNeg = 0;

        if (x > 0) {
            countPos++;
        } else if (x != 0) {
            countNeg++;
        }
        if (y > 0) {
            countPos++;
        } else if (y != 0) {
            countNeg++;
        }
        if (z > 0) {
            countPos++;
        } else if (z != 0) {
            countNeg++;
        }
        System.out.println("Положительных " + countPos + " Отррицательных " + countNeg);

        System.out.println("ex5");

        int x1 = 19;
        int y1 = 45;

        if (x1 > y1) {
            System.out.println(x1);
        } else if (x1 == y1) {
            System.out.println("Чила равны");
        } else {
            System.out.println(y1);
        }
        System.out.println("ex6");

        int s = 10;
        int d = 3;
        double res = (double) s / (double) d;

        System.out.println(res);

        System.out.println("ex7");

        int programmerCount = 121;
        if (programmerCount % 100 / 10 == 1) {
            System.out.println(programmerCount + " Програмистов");
        }
        else {

            switch (programmerCount % 10) {
                case 1:
                    System.out.println(programmerCount + " програмист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(programmerCount + " програмиста");
                    break;
                default:
                    System.out.println(programmerCount + " Програмистов");
            }
        }



    }


}

