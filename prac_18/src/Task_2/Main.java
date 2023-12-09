package Task_2;

import java.util.Scanner;

public class Main {
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public static void main(String[] args) {
        Main task = new Main();
        task.exceptionDemo1();
    }
}
