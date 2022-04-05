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
        return power + " " + maxSpeed + " " + weight+ " "+ brand+" " + wheelCount + " " +fuelExt + " " + numOfPassenger + " " + bodytype+ " " + getWatt();
    }
    public void getDistance(double hour){
        double distance = hour * maxSpeed;
        System.out.println("За время" + hour + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed +" км/ч проедет "
                + distance +" и израсходует "+ petrolExt(distance) + " литров топлива");
    }
    private double petrolExt(double distance){
        return  distance * maxSpeed/100;
    }
}
