import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        int first = random.nextInt(1000);
        int two = random.nextInt(1000);
        int three = random.nextInt(1000);
        System.out.println("Числа в этом раунде "+ first +" "+two+" "+three);
        int max = 0;
        if (first < two) {
            max = two;
        } else max = first;
        if (three > max) max = three;
        System.out.println("Наибольшее число: "+max);
    }
}


/*
Задача 7: Нахождение максимального числа
        Напишите программу, которая:

Объявляет три переменные one, two, three с любыми значениями

Находит наибольшее из трех чисел

Выводит результат в формате:
        "Наибольшее число: [max]"*/
