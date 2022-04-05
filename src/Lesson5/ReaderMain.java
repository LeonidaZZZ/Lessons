package Lesson5;

public class ReaderMain {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов В.В ",01,"История","01.03.1999", "+7705221314");
        Reader reader2 = new Reader("Петров И.К",02,"Финансы","08.03.2001","+7702453244");
        Reader reader3 = new Reader("Сидоров Г.Н",03,"Пердун","21.12.2000","+7777256545");



        Book b1 = new Book("Приключения");
        Book b2 =new Book("Словарь");
        Book b3 = new Book("Энциклопедиа");

        reader1.takeBook(3);

        reader1.takeBook("Приключения" , "Рома пердун" , "Жирный" ,"Вонючий");

        reader1.takeBook(b1,b2,b3);







    }
}