package Task_3;

public class Mainer {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        Expression expression = new Add(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Variable("x"), new Const(2))
                ),
                new Const(1)
        );
        int result = expression.evaluate(x);
        System.out.println(result);
    }
}
