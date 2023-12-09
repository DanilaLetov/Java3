package Task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter your INN: ");
        String INN = scanner.nextLine();
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        try {
            onlinePurchase.makePurchase(fullName, INN);
        } catch (InvalidINNException e) {
            System.out.println("Error occurred during purchase: " + e.getMessage());
        }
    }
}

