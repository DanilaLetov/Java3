public class IntegerRowManipulatorTest {
    public static void Integer() {
        IntegerRowManipulator sm1 = new IntegerRowManipulator("123456");

        int charCount = sm1.countCharacters(sm1.getString());
        System.out.println("Количество символов в строке: " + charCount);

        String oddChars = sm1.getOddCharacters(sm1.getString());
        System.out.println("Строка из символов на нечетных позициях: " + oddChars);

        String reversedString = sm1.reverseString(sm1.getString());
        System.out.println("Инвертированная строка: " + reversedString);

        int num = 12345;
        String numString = sm1.convertToString(num);
        System.out.println("Число в виде строки: " + numString);

        boolean sameSpeed = sm1.speedTest();
        System.out.println("Две точки имеют одну и ту же скорость: " + sameSpeed);
    }
}
