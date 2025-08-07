import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи температуру");
            while(!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!");
                scanner.next();
            }
            int temperature = scanner.nextInt();
            if (temperature < 5) {
                System.out.printf("На улице %d градусов, нужно надеть шапку", temperature);
            } else {
                System.out.printf("На улице %d градусов, можно идти без шапки", temperature);
            }
        }
    }
}
