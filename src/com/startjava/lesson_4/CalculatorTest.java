package com.startjava.lesson_4;

import com.startjava.lesson_2_3.calculator.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String option = "yes";
        while (option.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            Scanner scanner = new Scanner(System.in);
            String[] mathExpression = scanner.nextLine().split(" ");

            int a = Integer.parseInt(mathExpression[0]);
            char mathOperation = mathExpression[1].charAt(0);
            int b = Integer.parseInt(mathExpression[2]);

               Calculator calculator = new Calculator();
                System.out.println(calculator.calculate(a, b, mathOperation));
                option = "";

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while (!(option.equals("no") || option.equals("yes")));
        }
    }
}
