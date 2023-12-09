package Task_2;

import java.util.Stack;

public class CalculatorModel {
    private Stack<Double> stack;

    public CalculatorModel() {
        stack = new Stack<>();
    }

    public void push(double value) {
        stack.push(value);
    }

    public double peek() {
        return stack.peek();
    }

    public void add() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 + operand2;
        stack.push(result);
    }

    public void subtract() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 - operand2;
        stack.push(result);
    }

    public void multiply() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        double result = operand1 * operand2;
        stack.push(result);
    }

    public void divide() {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        if (operand2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = operand1 / operand2;
        stack.push(result);
    }

    public void clear() {
        stack.clear();
    }
}