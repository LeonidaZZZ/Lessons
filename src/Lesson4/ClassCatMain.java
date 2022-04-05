package Lesson4;

public class ClassCatMain {
    public static void main(String[] args) {
        System.out.println(Cat.count);

       Cat bakarbek = new Cat();
       bakarbek.age = 5;
       bakarbek.name = "Bakarbek";
       Cat.count++;
        System.out.println(Cat.count);


        System.out.println("Имя - " + bakarbek.name + " ,возраст" + bakarbek.age);

        bakarbek.info();



        Truck truck =  new Truck();
        truck.height = 3;
        truck.lenght = 10;
        truck.width = 3;


        int[][] arr = new int[5][5];
        ArrayHelper.fill(arr);

        System.out.println(ArrayHelper.toSttingArray(arr));

    }
}
