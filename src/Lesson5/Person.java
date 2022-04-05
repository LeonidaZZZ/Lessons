package Lesson5;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void info(){
        System.out.println("Name " + name + " Age " + age);
    }

}
