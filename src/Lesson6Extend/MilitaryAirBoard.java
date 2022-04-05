package Lesson6Extend;

public class MilitaryAirBoard extends AirTransport{
    boolean hasEjectiosystem;
    int rocketLounch;

    public MilitaryAirBoard(int power, int maxSpeed, int weight, String brand, double wingspan, double minRoadLenght, boolean hasEjectiosystem, int rocketLounch) {
        super(power, maxSpeed, weight, brand, wingspan, minRoadLenght);
        this.hasEjectiosystem = hasEjectiosystem;
        this.rocketLounch = rocketLounch;
    }
    @Override
    public String getInfo() {
        return power + " " + maxSpeed + " " + weight+ " "+ brand+" " + wingspan + " " +minRoadLenght + " " +  rocketLounch + " " + hasEjectiosystem+ " " + getWatt();
    }
}
