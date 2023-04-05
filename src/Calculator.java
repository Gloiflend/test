import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число");
        double var1= scanner.nextDouble();
        System.out.println("Введите операцию");
        char oprend= scanner.next().charAt(0);
        System.out.println("Введите второе число");
        double var2= scanner.nextDouble();
        String stop= scanner.nextLine();
        do {
            switch (oprend) {
                case '*' -> System.out.println(var1 * var2);
                case '/' -> System.out.println(var1 / var2);
                case '+' -> System.out.println(var1 + var2);
                case '-' -> System.out.println(var1 - var2);
                default -> System.out.println("Вы ввели неверную операцию");
            }}
            while (stop == "s") ;



    }
}
