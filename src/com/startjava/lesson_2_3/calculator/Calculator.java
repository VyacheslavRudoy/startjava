package com.startjava.lesson_2_3.calculator;

public class Calculator {

    public int calculate(int a, int b, char symbol) {
        int result = 0;
        if (a % 1 == 0 && b % 1 == 0 && a > 0 && b > 0) {
            switch (symbol) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                case '^':
                    result = 1;
                    for (int i = 1; i <= b; i++) {
                        result *= a;
                    }
                    break;
                case '%':
                    result = a % b;
            }
        }
        return result;
    }
}