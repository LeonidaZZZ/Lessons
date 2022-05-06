package Lesson7polimorf;

public class DayOfWeak {


       private String name;

    public String getName() {
        return name;
    }

    private DayOfWeak(String name) {
        this.name = name;
    }
    public final static DayOfWeak MONDAY = new DayOfWeak("Monday");
    public final static DayOfWeak TUESDAY = new DayOfWeak("Tuesday");
    public final static DayOfWeak WEDNESDAY = new DayOfWeak("Wednesday");

}
