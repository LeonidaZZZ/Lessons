package Lesson6Extend;

public class Main {
    public static void main(String[] args) {
        LightVehicle audi = new LightVehicle(120,220,1200,"Audi",4,15,"sedan",5);

        System.out.println(audi.getInfo());
        audi.getDistance(1.5);

    }
}
