import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int n) {
        if (n < 10) {
            return n;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            int reversedNumber = reverseNumber(remainingDigits);
            int numberOfDigits = (int) Math.log10(remainingDigits) + 1;
            return lastDigit * (int) Math.pow(10, numberOfDigits) + reversedNumber;
        }
    }

    public static void Reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseNumber(number);
        System.out.println("Reversed number: " + reversedNumber);
    }
}
