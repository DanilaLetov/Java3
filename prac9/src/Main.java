import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите номер:");
        System.out.println("1. 1-ый номер(ID)");
        System.out.println("2. 2-ой номер(GPA)");
        System.out.println("3. 3-ий номер(Слияние)");
        System.out.println("4. 4-ый номер(Отсебятина)");
        System.out.println("0. Выход");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                var id = new StudentTest();
                id.ID();
                break;
            case 2:
                var gpa = new SortingStudentsByGPA();
                gpa.GPA();
                break;
            case 3:
                var merge = new MergedSorting();
                merge.Merge();
                break;
            case 4:
                var mystudent = new MyStudentsTest();
                mystudent.MyStudent();
            case 0:
                System.out.println("Выход из программы");
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}