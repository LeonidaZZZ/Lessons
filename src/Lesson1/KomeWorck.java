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

        int x1 = 19;                    //Написать программу которая определит и выведет на экран большее число
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

        System.out.println("ex7");          //

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
        System.out.println("HomeWwork 2 ex 1");     //Создать прог. проверяющую и ссобщ на экран чет или не чет

        int n = 13;

        if (n % 10 / 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");

        }

        System.out.println("ex 2");     // написать прог опред интервал 10:50 // как 1е и 2е зд объединить и надо ли это

        int n1 = 13;

        if (n1 > 10 && n1 < 50){
            System.out.println("Число попадает в интервыл [10:50]");
        }
        else {
            System.out.println("Число не попадает в интервал [10:50]");
        }

        System.out.println("ex 3");     // Calendar

        int Feb = 4;

        switch (Feb) {
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Satuday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Monday");
                break;


        }


    }


}

