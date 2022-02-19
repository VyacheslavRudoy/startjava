package com.startjava.lesson_4;

public class Calculator {
    public double calculate(int a, int b, char symbol) {
        double result = 0;
        if (a % 1 == 0 && b % 1 == 0 && a > 0 && b > 0) {
            switch (symbol) {
                case '+':
                    result = Math.addExact(a, b);
                    break;
                case '-':
                    result = Math.subtractExact(a, b);
                    break;
                case '*':
                    result = Math.multiplyExact(a, b);
                    break;
                case '/':
                    result = Math.floorDiv(a, b);
                    break;
                case '^':
                    result = Math.pow(a, b);
                    break;
                case '%':
                    result = Math.IEEEremainder(a, b);
            }
        }
        return result;
    }
}

