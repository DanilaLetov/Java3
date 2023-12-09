import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер:");
        System.out.println("1. 5-ый номер(Сумма)");
        System.out.println("2. 17-ый номер(Макс число)");
        System.out.println("3. 8-ой номер(Палиндром)");
        System.out.println("4. 10-ый номер(Разворот)");
        System.out.println("0. Выход");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                var adder = new Addition();
                adder.Adder();
                break;
            case 2:
                var maxnum = new MaxNumber();
                maxnum.MaxNum();
                break;
            case 3:
                var palindrome = new Palindrome();
                palindrome.Palindromus();
                break;
            case 4:
                var reverse = new ReverseNumber();
                reverse.Reverse();
            case 0:
                System.out.println("Выход из программы");
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}