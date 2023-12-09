import java.util.Scanner;

public class MovablePointCircleTest {
    public static void MPCT() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x для точки: ");
        int x = scanner.nextInt();

        System.out.print("Введите координату y для точки: ");
        int y = scanner.nextInt();

        System.out.print("Введите скорость по x для точки: ");
        int xSpeed = scanner.nextInt();

        System.out.print("Введите скорость по y для точки: ");
        int ySpeed = scanner.nextInt();


        System.out.print("Введите скорость по x для центра круга: ");
        xSpeed = scanner.nextInt();

        System.out.print("Введите скорость по y для центра круга: ");
        ySpeed = scanner.nextInt();


        MovablePoint point = new MovablePoint(x, y, xSpeed, ySpeed);

        System.out.print("Введите радиус для круга: ");
        int radius = scanner.nextInt();

        System.out.print("Введите координату x для центра круга: ");
        x = scanner.nextInt();

        System.out.print("Введите координату y для центра круга: ");
        y = scanner.nextInt();

        MovableCircle circle = new MovableCircle(radius, x, y, xSpeed, ySpeed);

        System.out.println("Исходная точка: (" + point.getX() + ", " + point.getY() + ")");
        System.out.println("Исходный центр круга: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");

        // Двигаем точку и центр круга
        point.moveUp();
        circle.moveRight();

        System.out.println("Новая точка: (" + point.getX() + ", " + point.getY() + ")");
        System.out.println("Новый центр круга: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
    }
}