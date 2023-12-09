package Task_5;

import java.util.Scanner;

public class ThrowsDemo {
    public void getDetails(String key) {
        if (key == null)
            throw new NullPointerException("null key in getDetails");

    }


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a key: ");
        String key = myScanner.next();
        ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        myScanner.close();
    }
}