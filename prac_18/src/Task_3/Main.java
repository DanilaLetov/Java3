package Task_3;
import java.util.Scanner;

public class Main {
    public void exceptionDemo() {
        try{
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2 / i );
        } catch ( Exception e ) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Main ex = new Main();
        ex.exceptionDemo();
    }
}


