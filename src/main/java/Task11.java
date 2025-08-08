import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int month = random.nextInt(1, 13);

        switch (month) {
            case 12, 1,2 -> System.out.printf("%d месяц принадлежит к сезону зима",month);
            case 3, 4, 5 -> System.out.printf("%d месяц принадлежит к сезону весна",month);
            case 6, 7, 8 -> System.out.printf("%d месяц принадлежит к сезону лето",month);
            case 9, 10, 11 -> System.out.printf("%d месяц принадлежит к сезону осень",month);
        }
    }
}



/*

Дополнительное задание
        Напишите программу, которая:

Объявляет переменную monthNumber (1-12)

Определяет сезон:

        12,1,2 → зима

3-5 → весна

6-8 → лето

9-11 → осень

Выводит сообщение:
        "[monthNumber] месяц принадлежит к сезону [сезон]"
*/
