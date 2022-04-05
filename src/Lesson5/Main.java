package Lesson5;

public class Main {
    public static void main(String[] args) {


        Person person1 = new Person("Ivan",18);
        Person person2 = new Person("Fedor",25);
        Person person3 = new Person("AsЭt",32);
        Person person4 = new Person("David",21);
        Person person5 = new Person("Biba",15);

        Person[] array = new Person[5];
        array[0] = person1;
        array[1] = person2;
        array[2] = person3;
        array[3] = person4;
        array[4] = person5;

        for (int i = 0; i < array.length; i++) {
            if (array[i].age < 20){

                array[i].info();
            }

        }



    }
}
