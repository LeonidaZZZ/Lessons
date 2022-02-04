package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
//        int i1 = 10;
//
//        while (i1 > 0){
//            System.out.println(i1);
//            i1--;
//        }


//        for (int i = 0; i < 10; i = i + 2){
//            System.out.println(i);
//        }

//        int x = 0;
//        boolean isStop = true;
//
//        while (isStop){
//            System.out.println(x);
//            if (x == 10){
//                isStop = false;
//            }
//            x++;
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = i; j < 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100; j++) {
//                if (j == 4){
//                    break;
//                }
//                System.out.print(j + " ");
//            }
//            if (i == 3){
//                break;
//            }
//            System.out.println(i);
//        }


        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("213");
    }
}
