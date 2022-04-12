package org.qa.operators.calculator;

public class CalculatorRunner {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 3));
        System.out.println(calculator.multiplication(5, 3));
        System.out.println(calculator.subtraction(5, 3));
        System.out.println(calculator.division(3, 5));

    }

}
