package Task_1;

public class Exception3 {
    public void exceptionDemo3() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
    public static void main(String[] args) {
        Exception3 ex = new Exception3();
        ex.exceptionDemo3();
    }
}
