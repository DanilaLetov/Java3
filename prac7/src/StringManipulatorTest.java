public class StringManipulatorTest {
    public static void Manipulator() {
        StringManipulable sm1 = new StringManipulator();
        String s = "BANZAI_HERETICS!";

        int charCount = sm1.countCharacters(s);
        System.out.println("Количество символов в строке: " + charCount);

        String oddChars = sm1.getOddCharacters(s);
        System.out.println("Строка из символов на нечетных позициях: " + oddChars);

        String reversedString = sm1.reverseString(s);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}
