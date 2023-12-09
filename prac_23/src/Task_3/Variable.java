package Task_3;

class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    int evaluate(int x) {
        return x;
    }
}

abstract class BinaryOperation extends Expression {
    Expression left;
    Expression right;

    public BinaryOperation(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
