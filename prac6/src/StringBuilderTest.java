import java.util.Scanner;

public class StringBuilderTest {
    public static void Builder() {
        Scanner scanner = new Scanner(System.in);
        UndoableStringBuilder stringBuilder = new UndoableStringBuilder();

        int choice;
        do {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить строку");
            System.out.println("2. Удалить символы");
            System.out.println("3. Отменить последнюю операцию");
            System.out.println("4. Вывести текущую строку");
            System.out.println("0. Выйти");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите строку:");
                    String input = scanner.nextLine();
                    stringBuilder.append(input);
                    break;
                case 2:
                    System.out.println("Введите индексы для удаления (начальный и конечный):");
                    int start = scanner.nextInt();
                    int end = scanner.nextInt();
                    stringBuilder.delete(start, end);
                    break;
                case 3:
                    stringBuilder.undo();
                    break;
                case 4:
                    System.out.println("Текущая строка: " + stringBuilder);
                    break;
                case 0:
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Некорректный выбор");
            }
        } while (choice != 0);

        scanner.close();
    }
}

