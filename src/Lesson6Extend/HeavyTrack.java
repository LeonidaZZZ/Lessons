package Lesson6Extend;

public class HeavyTrack extends LandTransport{
    int loadCapacity;

    public HeavyTrack(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelExt, int loadCapacity) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelExt);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String getInfo() {
        return power + " " + maxSpeed + " " + weight+ " "+ brand+" " + wheelCount + " " +fuelExt + " " + loadCapacity+ " " + getWatt();
    }
}
