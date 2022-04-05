package Lesson5Calculation;

public class Calculation {
    int i;
    int b;

    public Calculation(int i, int b) {
        this.i = i;
        this.b = b;
    }

    public int sum(){
        return i + b;
    }

    public void minus(){
        System.out.println(i - b);
    }


}
