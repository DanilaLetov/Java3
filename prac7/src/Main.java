import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер:");
        System.out.println("1. 8-ой номер(Авторы)");
        System.out.println("2. 3-ий номер(Строки с цифрами)");
        System.out.println("3. 5-ый номер(Строки)");
        System.out.println("4. 4-ый номер(Математика)");
        System.out.println("0. Выход");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                var creationist = new BookTest();
                creationist.Creationist();
                break;
            case 2:
                var integer = new IntegerRowManipulatorTest();
                integer.Integer();
                break;
            case 3:
                var manipulator = new StringManipulatorTest();
                manipulator.Manipulator();
                break;
            case 4:
                var maths = new MathFuncTest();
                maths.Mather();
            case 0:
                System.out.println("Выход из программы");
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}
