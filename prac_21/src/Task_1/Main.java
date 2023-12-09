package Task_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        Object[] array = new Object[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            } else if (scanner.hasNextDouble()) {
                array[i] = scanner.nextDouble();
            } else if (scanner.hasNextBoolean()) {
                array[i] = scanner.nextBoolean();
            } else {
                array[i] = scanner.next();
            }
        }

        Converter solution = new Converter();
        ArrayList<Object> list = solution.convertToList(array);

        System.out.println("List: " + list);
    }
}
