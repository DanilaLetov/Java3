package Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 2 numbers: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("Sum: " + Calculator.sum(num1,num2));
        System.out.println("Difference: " + Calculator.subtraction(num1,num2));
        System.out.println("Product: " + Calculator.multiply(num1,num2));
        try{
        System.out.println("Quotient: " + Calculator.divide(num1,num2));
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
