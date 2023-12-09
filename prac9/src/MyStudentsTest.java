import java.util.Scanner;
import java.util.Arrays;
public class MyStudentsTest {
    public static void MyStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите ID студента: ");
            int id = scanner.nextInt();

            System.out.print("Введите итоговый балл студента: ");
            double gpa = scanner.nextDouble();

            students[i] = new Student(id, gpa);
        }

        Arrays.sort(students);

        System.out.println("Отсортированный список студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
