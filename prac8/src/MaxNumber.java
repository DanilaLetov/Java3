import java.util.Scanner;

public class MaxNumber {
    public static int findMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            scanner.close();
            return 0;
        }

        int maxNumber = findMaxNumber();
        scanner.close();

        return Math.max(number, maxNumber);
    }

    public static void MaxNum() {
        System.out.println("Enter a sequence of numbers (one number per line), ending with 0:");
        int maxNumber = findMaxNumber();
        System.out.println("Maximum number: " + maxNumber);
    }
}
