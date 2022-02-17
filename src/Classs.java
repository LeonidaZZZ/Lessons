import java.util.Arrays;

public class Classs {
    public static void main(String[] args) {
        System.out.println(Cat.count);


        Cat tom = new Cat();
        tom.age = 5;
        tom.name = "Tom";
        Cat.count++;
        System.out.println(Cat.count);
        tom.info();

        Cat mack = new Cat();
        mack.age = 3;
        mack.name = "Mack";
        Cat.count++;
        System.out.println(Cat.count);


        System.out.println("Имя - " + tom.name + " Возраст - " + tom.age);
        System.out.println("Имя - " + mack.name + " Возраст - " + mack.age);


        Truck truck = new Truck();
        truck.width = 3;
        truck.lenght = 10;
        truck.height = 3;
        truck.getVolume();


        int[][] arg = new int[5][5];
        ArrayHelper.fill(arg);
        ArrayHelper arrayHelper = new ArrayHelper();
        String string = arrayHelper.toStringArray(arg);
        System.out.println(string);

    }
}


