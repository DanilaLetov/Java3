import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Circle[] array = new Circle[5];

        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt(20);
            int y = random.nextInt(20);
            double radius = random.nextDouble() + random.nextInt(40);

            Circle circle = new Circle(x, y, radius);

            array[i] = circle;
        }

        System.out.println("Созданные окружности: ");

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " ");
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("Наименьшая площадь: \n" + array[0]);
        System.out.println("Наибольшая площадь: \n" + array[array.length - 1]);
    }
}