package Lesson5Computer;

public class Main {
    public static void main(String[] args) {


        Computer pc1 = new Computer("intel i5 11400", "DDR 4 1600", "WD Blue 1Tb");
        Computer pc2 = new Computer("AMD Rezen3", "DDR4 1833", "Seagate 500Gb");

        pc1.info();
        pc1.switchOn(0);
        pc1.switchOff(1);


    }
}
