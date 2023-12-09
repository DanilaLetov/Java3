package Task_7;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;
        do {
            try {
                System.out.print("Enter Key ");
                String key = myScanner.nextLine();
                printDetails(key);
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!success);
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if (key.equals(""))
            throw new Exception("Key set to empty string");
        return "data for " + key;
    }
    public static void main(String[] args){
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
