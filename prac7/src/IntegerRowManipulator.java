public class IntegerRowManipulator implements IntegerRowManipulate {
    private String s;
    private int speed;

    public IntegerRowManipulator(String s) {
        this.s = s;
    }

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getOddCharacters(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String getString() {
        return s;
    }


    public void setString(String s) {
        this.s = s;
    }


    public String convertToString(int num) {
        return String.valueOf(num);
    }


    public boolean speedTest() {

        PointSpeed point1 = new PointSpeed();
        PointSpeed point2 = new PointSpeed();

        // Сравниваем скорости точек
        return point1.getSpeed(speed) == point2.getSpeed(speed);
    }
}

