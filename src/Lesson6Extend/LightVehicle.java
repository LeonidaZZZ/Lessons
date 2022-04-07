package Lesson6Extend;

public class LightVehicle extends LandTransport {
    String bodytype;
    int numOfPassenger;

    public LightVehicle(int power, int maxSpeed, int weight, String brand, int wheelCount, double fuelExt, String bodytype, int numOfPassenger) {
        super(power, maxSpeed, weight, brand, wheelCount, fuelExt);
        this.bodytype = bodytype;
        this.numOfPassenger = numOfPassenger;
    }

    @Override
    public String getInfo() {
        return "Авто марки " + brand + " ,мощность " + power +" л/с максимальная скорость " + maxSpeed + " км/ч, расход топлива " +
                fuelExt + " литров на 100 км ,масса кузова " + weight+ " ,тип кузова "+
                bodytype + " ,колес " + wheelCount + " , пассажирских мест"  + numOfPassenger + " ,мощность в кВ/ч " +  getWatt();
    }
    public void getDistance(double hour){
        double distance = hour * maxSpeed;
        System.out.println("За время" + hour + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed +" км/ч проедет "
                + distance +" и израсходует "+ petrolExt(hour) + " литров топлива");
    }
    private double petrolExt(double hour){ return fuelExt * maxSpeed / 100 * hour ;}


}