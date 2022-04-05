package Lesson6Extend;

public class CivilAirBoard extends AirTransport {
    int numOfPassenger;
    boolean hasBusinessClass;

    public CivilAirBoard(int power, int maxSpeed, int weight, String brand, double wingspan, double minRoadLenght, int numOfPassenger, boolean hasBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRoadLenght);
        this.numOfPassenger = numOfPassenger;
        this.hasBusinessClass = hasBusinessClass;
    }

    @Override
    public String getInfo() {
        return power + " " + maxSpeed + " " + weight+ " "+ brand+" " + wingspan + " " +minRoadLenght + " " + numOfPassenger + " " + hasBusinessClass + " " + getWatt();
    }

}
