package Lesson5Computer;

import java.util.Random;

public class Computer {

    String cpu;
    String ram;
    String hdd;
    int cycle = 1;

    public Computer(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;

    }

    Random rnd = new Random();
    Boolean isOff = true;

    void info() {
        System.out.println(cpu + " ," + ram + " ," + hdd);
    }

    void switchOn(int on) {
        if (!isOff) {
            System.out.println("PC is already switched On");
            return;
        }
        int rnd1 = rnd.nextInt(2);

        if (rnd1 == on && cycle > 0) {
            System.out.println("Welcome to Widows");
            isOff = false;
        } else {
            System.out.println("PC is Dead");
            cycle = 0;
        }
    }

    void switchOff(int off) {
        if (cycle == 0) {
            System.out.println("PC is Spoiled");
            return;
        }

        if (isOff) {
            System.out.println("Pc already switched Off");
            return;
        }
        int rnd2 = rnd.nextInt(2);

        if (rnd2 == off) {
            System.out.println("Bye");
            cycle--;
        } else {
            System.out.println("PC is Dead");
            cycle = 0;
        }


    }


}
