import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {

        boolean activity = true;
        while (activity == true) {
            System.out.println("Введите первое число: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            System.out.println("Введите знак математической операции: ");
            char mathOperation = scanner.next().charAt(0);

            System.out.println("Введите второе число: ");
            int b = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.calculate(a, b, mathOperation);
            System.out.println(calculator.getResult());

            String option = "";
            option = scanner.nextLine();


            while (!(option.equals("no") || option.equals("yes")))  {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                option = scanner.nextLine();
                if (option.equals("no")) {
                    activity = false;
                }
            }
        }
    }
}
