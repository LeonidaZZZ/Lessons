package Lesson7polimorf;

public class Main {
    public static void main(String[] args) {


        DayOfWeackEnum [] daweArray = DayOfWeackEnum.values();
        for (DayOfWeackEnum dayOfWeackEnum : daweArray) {
            System.out.println(dayOfWeackEnum);
        }

        String [] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(i);

        }
        for (String str1:str){
            System.out.println(str1);
        }


    }

    static String menu(DayOfWeackEnum dow1) {
        switch (dow1) {
            case  MONDAY:
                return "Каша";
            case TUESDAY:
                return "Боршч";
            case WEDNESDAY:
                return "Плов";
            default:
                return "Глодайте";

        }
    }


}
