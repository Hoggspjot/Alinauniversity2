import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int speed = random.nextInt(100);
        if (speed > 60) {
            System.out.printf("Если скорость %d, то придется заплатить штраф", speed);
        } else {
            System.out.printf("Если скорость %d, можно ездить спокойно", speed);
        }
    }
}
