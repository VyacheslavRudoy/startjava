package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calculate(String line) {
        String[] mathExpression = line.split(" ");
        int a = Integer.parseInt(mathExpression[0]);
        char mathOperation = mathExpression[1].charAt(0);
        int b = Integer.parseInt(mathExpression[2]);
        int result = 0;
        if (a % 1 == 0 && b % 1 == 0 && a > 0 && b > 0) {
            switch (mathOperation) {
                case '+':
                    return Math.addExact(a, b);
                case '-':
                    return Math.subtractExact(a, b);
                case '*':
                    return Math.multiplyExact(a, b);
                case '/':
                    return Math.floorDiv(a, b);
                case '^':
                    return (int) Math.pow(a, b);
                case '%':
                    return (int) Math.IEEEremainder(a, b);
            }
        }
        return 0;
    }
}