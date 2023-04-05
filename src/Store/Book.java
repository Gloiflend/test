package Store;

import java.util.Scanner;

public class Book {
    static String[] book = new String[99];
    public static void main(String[] args) {


        /*Books book1= new Books();
        book1.name= "Хоббит";
        book1.data= 1937;
        book1.sale= 10;
        Books book2= new Books();
        book2.name= "Зеленая миля";
        book2.data= 2014;
        book2.sale= 12;*/

    }
}
class Books{
    static String name;
    static int sale;
    static int data;

    public static void search(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите название книги");
        name= scanner.next();
        System.out.println("Введите дату издания");
        data= scanner.nextInt();
        System.out.println("Введите цену");
        sale= scanner.nextInt();
    }


}

