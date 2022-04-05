package Lesson5Calculation;

public class Main {
    public static void main(String[] args) {

        Calculation calc = new Calculation(5,5);
        int i = calc.sum();
        System.out.println(i);

        calc.minus();
    }


}
