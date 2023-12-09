import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(word.length() - 1);
            String middle = word.substring(1, word.length() - 1);
            return (firstChar == lastChar) && isPalindrome(middle);
        }
    }

    public static void Palindromus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}