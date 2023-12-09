import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MergedSorting {
    public static void Merge() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов в первом списке: ");
        int n1 = scanner.nextInt();

        Student[] students1 = new Student[n1];

        for (int i = 0; i < n1; i++) {
            System.out.print("Введите ID студента: ");
            int id = scanner.nextInt();

            System.out.print("Введите итоговый балл студента: ");
            double gpa = scanner.nextDouble();

            students1[i] = new Student(id, gpa);
        }

        System.out.print("Введите количество студентов во втором списке: ");
        int n2 = scanner.nextInt();

        Student[] students2 = new Student[n2];

        for (int i = 0; i < n2; i++) {
            System.out.print("Введите ID студента: ");
            int id = scanner.nextInt();

            System.out.print("Введите итоговый балл студента: ");
            double gpa = scanner.nextDouble();

            students2[i] = new Student(id, gpa);
        }

        SortingStudentsByGPA quickSort = new SortingStudentsByGPA();
        quickSort.sort(students1);
        quickSort.sort(students2);

        Student[] merged = quickSort.mergeSort(students1, students2);

        System.out.println("Объединенный и отсортированный список студентов:");
        for (Student student : merged) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }
}
