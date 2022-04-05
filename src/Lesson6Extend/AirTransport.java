package Lesson6Extend;

public abstract class AirTransport extends Transport {
    double wingspan;
    double minRoadLenght;

    public AirTransport(int power, int maxSpeed, int weight, String brand, double wingspan, double minRoadLenght) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRoadLenght = minRoadLenght;
    }
}
