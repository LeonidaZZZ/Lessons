package Lesson6Extend;

public class MilitaryAirBoard extends AirTransport {
    boolean hasEjectiosystem;
    int rocketLounch;

    public MilitaryAirBoard(int power, int maxSpeed, int weight, String brand, double wingspan, double minRoadLenght, boolean hasEjectiosystem, int rocketLounch) {
        super(power, maxSpeed, weight, brand, wingspan, minRoadLenght);
        this.hasEjectiosystem = hasEjectiosystem;
        this.rocketLounch = rocketLounch;
    }

    @Override
    public String getInfo() {
        return "Марка " + brand + " ,мощность " + power + " л/с , максимальная скорость " + maxSpeed + " км/ч" +
                " ,вес " + weight + " размах крыльев - " + wingspan + " минимальная длина взлетной полосы - " + minRoadLenght +
                " ,наличие система катапультирования - " + hasEjectiosystem + " ,количество ракет - " + rocketLounch + " ,мощность в кВ/ч " + getWatt();


    }

    public void fire() {
        if (rocketLounch > 0) {
            System.out.println("Ракета пошла");
            rocketLounch --;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public String  ejectSystem(){
        return hasEjectiosystem ? "Катапультирование прошло успешно": "У вас нет такой системы";

    }
}
