package Task_2;

import java.util.ArrayList;

public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Tihogromov", 15, 6, 45));
        s.add(new Student("Neudachnikov", 45, 6, 6));
        s.add(new Student("Durakov", 1, 6, 99));
        s.add(new Student("Starikov", 60, 7, 55));
        s.add(new Student("Comradov", 87, 7, 70));

        new Hell(s);
    }

}
