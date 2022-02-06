public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        char symbol = '^';
        int result = 0;

        if (a % 1 == 0 && b % 1 == 0 && a > 0 && b > 0) {
            if (symbol == '+') {
                result =  a + b;
            } else  if (symbol == '-') {
                result = a - b;
            } else if (symbol == '*') {
                result = a * b;
            } else if (symbol == '/') {
                result = a / b;
            } else if (symbol == '^') {
                result = 1;
                for (int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if (symbol == '%') {
                result = a % b;
            }

            System.out.println(result);
        }
    }
}
