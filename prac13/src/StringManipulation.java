import java.util.Scanner;

public class StringManipulation {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!");
        System.out.println("Строка заканчивается на '!': " + endsWithExclamation);

        boolean startsWithILike = str.startsWith("I trust");
        System.out.println("Строка начинается с 'I trust': " + startsWithILike);

        boolean containsJava = str.contains("Myself");
        System.out.println("Строка содержит 'Myself': " + containsJava);

        int javaIndex = str.indexOf("Exams");
        System.out.println("Позиция подстроки 'Exams': " + javaIndex);

        String replacedStr = str.replace('y', 'u');
        System.out.println("Замененная строка: " + replacedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        System.out.print("Введите подстроку для вырезания: ");
        String substring = scanner.nextLine();
        int startIndex = str.indexOf(substring);
        int endIndex = startIndex + substring.length();
        String cutStr = str.substring(0, startIndex) + str.substring(endIndex);
        System.out.println("Вырезанная строка: " + cutStr);
    }
}