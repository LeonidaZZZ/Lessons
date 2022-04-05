package Lesson6Extend;

public abstract class LandTransport extends Transport {

    int wheelCount;
    double fuelExt;

    public LandTransport(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelExt) {

        super(power, maxSpeed, weight, brand);
        this.wheelCount = wheelCount;
        this.fuelExt = fuelExt;
    }


}
