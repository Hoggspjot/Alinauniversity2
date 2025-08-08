import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int passengers = random.nextInt(0, 150);
        System.out.println(passengers);
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        } else if (passengers > 60 && passengers <= 102) {
            System.out.println("Остались только стоячие места");
        } else {
            System.out.println("Вагон полон");
        }
    }
}





/*
Задача 6: Места в вагоне
        Напишите программу, которая:

Объявляет переменную passengers с любым значением

Учитывает:

        60 сидячих мест

42 стоячих места

Выводит сообщение о наличии мест:
        "[Есть сидячие места/Остались только стоячие места/Вагон полон]"
*/
