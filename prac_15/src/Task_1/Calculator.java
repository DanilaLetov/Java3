package Task_1;

import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        Frame f = new Frame("Calculator");
        final TextField num1 = new TextField();
        final TextField num2 = new TextField();
        final TextField result = new TextField();
        Button addBtn = new Button("Add");
        Button subtractBtn = new Button("Subtract");
        Button multiplyBtn = new Button("Multiply");
        Button divideBtn = new Button("Divide");

        num1.setBounds(50, 50, 100, 20);
        num2.setBounds(200, 50, 100, 20);
        result.setBounds(150, 100, 100, 20);
        addBtn.setBounds(50, 150, 60, 30);
        subtractBtn.setBounds(130, 150, 60, 30);
        multiplyBtn.setBounds(210, 150, 60, 30);
        divideBtn.setBounds(290, 150, 60, 30);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(number1 + number2));
            }
        });

        subtractBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(number1 - number2));
            }
        });

        multiplyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                result.setText(String.valueOf(number1 * number2));
            }
        });

        divideBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number1 = Integer.parseInt(num1.getText());
                int number2 = Integer.parseInt(num2.getText());
                if (number2 != 0) {
                    result.setText(String.valueOf((double) number1 / number2));
                } else {
                    result.setText("Cannot divide by zero");
                }
            }
        });

        f.add(num1);
        f.add(num2);
        f.add(result);
        f.add(addBtn);
        f.add(subtractBtn);
        f.add(multiplyBtn);
        f.add(divideBtn);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}