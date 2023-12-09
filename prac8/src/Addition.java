import java.util.Scanner;

public class Addition {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public static void Adder() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is " + sum);
    }
}