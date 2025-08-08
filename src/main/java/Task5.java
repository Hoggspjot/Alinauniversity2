import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();
        int childAge = random.nextInt(0,18);
        boolean hasParent = random.nextBoolean();

        System.out.println(childAge +" " + hasParent);

        if (childAge < 5) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься",childAge);
        } else if ((childAge >= 5 && childAge < 15) && hasParent) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься с сопровождением", childAge);
        } else if ((childAge >= 5 && childAge < 15) && !hasParent) {
            System.out.printf("Если возраст ребенка равен %d, то ему нельзя кататься без сопровождения", childAge);
        } else if (childAge >= 15) {
            System.out.printf("Если возраст ребенка равен %d, то ему можно кататься без сопровождения",childAge);
        }

    }
}


/*

Задача 5: Ограничения на аттракционе
        Напишите программу, которая:

Объявляет переменные childAge и hasParent (true/false)

Определяет правила доступа:

До 5 лет → нельзя

5-14 лет → только с взрослым

14+ лет → можно без ограничений

Выводит сообщение в формате:
        "Если возраст ребенка равен [childAge], то ему" +
        " [нельзя кататься/можно кататься с сопровождением/можно кататься без сопровождения]"
*/
