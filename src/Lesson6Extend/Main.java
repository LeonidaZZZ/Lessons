package Lesson6Extend;

public class Main {
    public static void main(String[] args) {
        LightVehicle audi = new LightVehicle(120,220,1200,"Audi",4,15,"sedan",5);

        System.out.println(audi.getInfo());
        audi.getDistance(1.5);

        MilitaryAirBoard f22 = new MilitaryAirBoard(2000,2000,13,"Raptor F22",5,700,true,8);

        while (f22.rocketLounch > 0 ){
            f22.fire();
        }
        f22.fire();
        System.out.println(f22.ejectSystem());

    }
}
