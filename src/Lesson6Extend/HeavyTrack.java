package Lesson6Extend;

public class HeavyTrack extends LandTransport {
    double loadCapacity;

    public HeavyTrack(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelExt, double loadCapacity) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelExt);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String getInfo() {
        return "Авто марки " + brand + " ,мощность " + power + " л/с , максимальная скорость " + maxSpeed + " км/ч, расход топлива " +
                fuelExt + " литров на 100 км ,масса кузова " + weight +
                " ,колес " + wheelCount + " грузоподъемность " + loadCapacity + " ,мощность в кВ/ч " + getWatt();

    }

    public void load(double cargo) {
        if (cargo <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Нужен грузовик по больше");
        }

    }

}
