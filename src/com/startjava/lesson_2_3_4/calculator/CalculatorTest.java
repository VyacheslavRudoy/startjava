package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String option = "yes";
        while (option.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            Scanner scanner = new Scanner(System.in);
            String[] mathExpression = scanner.nextLine().split(" ");

            Calculator calculator = new Calculator();
            System.out.println(calculator.calculate(mathExpression));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while (!(option.equals("no") || option.equals("yes")));
        }
    }
}