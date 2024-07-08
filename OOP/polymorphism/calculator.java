package OOP.polymorphism;

import java.util.Scanner;

abstract class Operator {
    public abstract double perform(double operand1, double operand2);
}

class Addition extends Operator {
    @Override
    public double perform(double operand1, double operand2) {
        return operand1 + operand2;
    }
}

class Subtraction extends Operator {
    @Override
    public double perform(double operand1, double operand2) {
        return operand1 - operand2;
    }
}

class Multiplication extends Operator {
    @Override
    public double perform(double operand1, double operand2) {
        return operand1 * operand2;
    }
}

class Division extends Operator {
    @Override
    public double perform(double operand1, double operand2) {
        if (operand2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return operand1 / operand2;
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the operator: ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        Operator op;
        
        switch (operator) {
            case '+':
                op = new Addition();
                result = op.perform(num1, num2);
                break;
            case '-':
                op = new Subtraction();
                result = op.perform(num1, num2);
                break;
            case '*':
                op = new Multiplication();
                result = op.perform(num1, num2);
                break;
            case '/':
                op = new Division();
                result = op.perform(num1, num2);
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        
        System.out.printf("Result: %.2f\n", result);
        
        scanner.close();
    }
}