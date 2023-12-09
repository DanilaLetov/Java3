package Task_1;

public class Exception2 {
    public void exceptionDemo2() {
        System.out.println( 2.0 / 0.0 );
    }
    public static void main(String[] args) {
        Exception2 ex = new Exception2();
        ex.exceptionDemo2();
    }
}
