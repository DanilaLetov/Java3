package Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        Object[] intArray = new Object[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter element " + (i) + ": ");
            intArray[i] = scanner.nextInt();
        }

        Hunter<Object> intSolution = new Hunter<>(intArray);
        System.out.print("Enter the index of the element to retrieve: ");
        int index = scanner.nextInt();
        System.out.println("Element at index " + index + " is: " + intSolution.getElement(index));
    }
}
