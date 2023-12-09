import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер:");
        System.out.println("1. 1-ый номер(Круг и точка)");
        System.out.println("2. 3-ий номер(Имена)");
        System.out.println("3. 11-ый номер(Градусы)");
        System.out.println("4. 12-ый номер(Стройка)");
        System.out.println("0. Выход");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                var mpct = new MovablePointCircleTest();
                mpct.MPCT();
                break;
            case 2:
                var namer = new NameableTest();
                namer.Namer();
                break;
            case 3:
                var farrenheiter = new TemperatureConverter();
                farrenheiter.Farrenheit();
                break;
            case 4:
                var builder = new StringBuilderTest();
                builder.Builder();
            case 0:
                System.out.println("Выход из программы");
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}
