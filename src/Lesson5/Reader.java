package Lesson5;

public class Reader {
    String name;
    int biltnom;
    String faculty;
    String bDate;
    String telNumber;
//    static int count = 0;
//    int res;

    public Reader(String name, int biltnom, String faculty, String bDate, String telNumber) {
        this.name = name;
        this.biltnom = biltnom;
        this.faculty = faculty;
        this.bDate = bDate;
        this.telNumber = telNumber;
    }

    void takeBook(int countBook) {

            if(countBook % 100 / 10 == 1){
                System.out.println(name + "взял " + countBook + " " + "книг");
            }
            else{
                switch (countBook % 10){
                    case 1:
                        System.out.println(name + "взял " + countBook + " " + "книгу");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(name + "взял " + countBook + " " + "книги");
                        break;
                    default:
                        System.out.println(name + "взял " + countBook + " " + "книг");
                }
            }
    }


    void takeBook(String... names) {
        String str2 = "";
        for (int i = 0; i < names.length; i++) {
            str2 = str2 + names[i] + ", ";

        }
        System.out.println(name + " взял книги: " + str2);
    }

    void takeBook(Book... names) {
        String str2 = "";
        for (int i = 0; i < names.length; i++) {
            str2 = str2 + names[i].name + ", ";
        }
        System.out.println(name + " взял книги: " + str2);
    }

    void returnBook(int countBook){

        if(countBook % 100 / 10 == 1){
            System.out.println(name + "вернул " + countBook + " " + "книг");
        }
        else{
            switch (countBook % 10){
                case 1:
                    System.out.println(name + "вернул " + countBook + " " + "книгу");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(name + "вернул " + countBook + " " + "книги");
                    break;
                default:
                    System.out.println(name + "венул " + countBook + " " + "книг");
            }
        }
    }



}
