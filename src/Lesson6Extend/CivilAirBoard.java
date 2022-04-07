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
        return "Марка " + brand + " ,мощность " + power + " л/с , максимальная скорость " + maxSpeed + " км/ч" +
                " ,вес " + weight + " размах крыльев - " + wingspan + " минимальная длина взлетной полосы - " + minRoadLenght +
                " ,количество пассажирских мест - " + numOfPassenger + " ,наличие Бизнес класса" + hasBusinessClass + " ,мощность в кВ/ч " + getWatt();

    }
    public boolean passenger(int passenger){
        return numOfPassenger >= passenger;
    }

}
