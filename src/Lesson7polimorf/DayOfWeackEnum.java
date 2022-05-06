package Lesson7polimorf;

public enum DayOfWeackEnum {
    MONDAY("Monday"),
    TUESDAY("Thuseday"),
    WEDNESDAY("Wednesday");
    private String name;

    public String getName() {
        return name;
    }

    DayOfWeackEnum(String name) {
        this.name = name;
    }
}
