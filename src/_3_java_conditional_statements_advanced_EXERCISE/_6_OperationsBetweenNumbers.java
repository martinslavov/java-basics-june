package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);

        if (operator == '+') {
            int result = n1 + n2;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", n1, operator, n2, result);
            }
        } else if (operator == '-') {
            int result = n1 - n2;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", n1, operator, n2, result);
            }
        } else if (operator == '*') {
            int result = n1 * n2;

            if (result % 2 == 0) {
                System.out.printf("%d %c %d = %d - even", n1, operator, n2, result);
            } else {
                System.out.printf("%d %c %d = %d - odd", n1, operator, n2, result);
            }
        } else if (operator == '/') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                double result = n1 / (n2 * 1.0);
                System.out.printf("%d / %d = %.2f", n1, n2, result);
            }
        } else if (operator == '%') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            } else {
                int result = n1 % n2;
                System.out.printf("%d %c %d = %d", n1, operator, n2, result);
            }
        }
    }
}
