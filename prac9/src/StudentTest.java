import java.util.Scanner;

public class StudentTest {
    public static void ID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the ID number for student " + (i + 1) + ":");
            int idNumber = scanner.nextInt();
            students[i] = new Student(idNumber, 0);
        }

        insertionSort(students);

        System.out.println("Sorted array of students:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].getIDNumber());
        }

        scanner.close();
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }
    }
}