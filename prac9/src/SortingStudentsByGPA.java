import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {
    public Student[] mergeSort(Student[] students1, Student[] students2) {
        int n1 = students1.length;
        int n2 = students2.length;
        Student[] merged = new Student[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (compare(students1[i], students2[j]) > 0) {
                merged[k] = students1[i];
                i++;
            } else {
                merged[k] = students2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            merged[k] = students1[i];
            i++;
            k++;
        }

        while (j < n2) {
            merged[k] = students2[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void GPA() {
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

        SortingStudentsByGPA quickSort = new SortingStudentsByGPA();
        quickSort.sort(students);

        System.out.println("Отсортированный список студентов:");
        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", GPA: " + student.getGPA());
        }
    }

    @Override
    public int compare(Student s1, Student s2) {
        // Сравниваем итоговые баллы студентов в порядке убывания
        if (s1.getGPA() < s2.getGPA()) {
            return 1;
        } else if (s1.getGPA() > s2.getGPA()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void sort(Student[] students) {
        quickSort(students, 0, students.length - 1);
    }

    private void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].getGPA() >= pivot.getGPA()) {
                i++;

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }
}