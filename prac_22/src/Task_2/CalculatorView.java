package Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame implements ActionListener {
    private JTextField inputField;
    private JTextArea outputArea;
    private CalculatorModel model;

    public CalculatorView(CalculatorModel model) {
        this.model = model;
        setTitle("RPN Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inputField = new JTextField();
        inputField.addActionListener(this);
        add(inputField, BorderLayout.NORTH);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 4));
        add(buttonPanel, BorderLayout.SOUTH);

        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        buttonPanel.add(subtractButton);

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        buttonPanel.add(multiplyButton);

        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        buttonPanel.add(divideButton);

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(this);
        buttonPanel.add(clearButton);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(this);
        buttonPanel.add(equalButton);

        pack();
        setVisible(true);
    }

    public String getInput() {
        return inputField.getText();
    }

    public void clearInput() {
        inputField.setText("");
    }

    public void appendOutput(String text) {
        outputArea.append(text + "\n");
    }

    public void clearOutput() {
        outputArea.setText("");
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("=")) {
            calculate();
        } else if (command.equals("C")) {
            clear();
        } else {
            inputField.setText(inputField.getText() + " " + command);
        }
    }

    private void calculate() {
        clearOutput();

        try {
            String input = getInput();
            String[] tokens = input.split("\\s+");
            for (String token : tokens) {
                switch (token) {
                    case "+":
                        model.add();
                        break;
                    case "-":
                        model.subtract();
                        break;
                    case "*":
                        model.multiply();
                        break;
                    case "/":
                        model.divide();
                        break;
                    default:
                        double value = Double.parseDouble(token);
                        model.push(value);
                        break;
                }
            }

            appendOutput("Result: " + model.peek());
        } catch (NumberFormatException e) {
            appendOutput("Invalid input: " + e.getMessage());
        } catch (ArithmeticException e) {
            appendOutput("Error: " + e.getMessage());
        }
    }

    private void clear() {
        model.clear();
        clearInput();
        clearOutput();
    }
}


