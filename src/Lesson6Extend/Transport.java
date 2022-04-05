package Lesson6Extend;

public abstract class Transport {

    int power;
    int maxSpeed;
    int weight;
    String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public abstract String getInfo();

    public double getWatt(){
        return power * 0.74;
    }



}
