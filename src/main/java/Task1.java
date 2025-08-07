
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введи возраст");
            while (!scanner.hasNextInt()) {
                System.out.println("Введи число!");
                scanner.next();
            }
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.printf("Если возраст человека %d, то он совершеннолетний", age);
            } else {
                System.out.printf("Если возраст человека %d, то он не достиг совершеннолетияб нужно немного подождать", age);
            }
        }
    }
}
