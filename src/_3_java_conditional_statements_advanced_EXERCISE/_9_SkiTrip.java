package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;
        double finalSum = 0.0;

        if (roomType.equals("room for one person")) {
            finalSum = 18.0 * nights;

        } else if (roomType.equals("apartment")) {
            finalSum = 25.0 * nights;

            if (days < 10) {
                finalSum = finalSum * 0.70;
            } else if (days >= 10 && days <= 15) {
                finalSum = finalSum * 0.65;
            } else if (days > 15) {
                finalSum = finalSum * 0.50;
            }

        } else if (roomType.equals("president apartment")) {
            finalSum = 35.0 * nights;

            if (days < 10) {
                finalSum = finalSum * 0.90;
            } else if (days >= 10 && days <= 15) {
                finalSum = finalSum * 0.85;
            } else if (days > 15) {
                finalSum = finalSum * 0.80;
            }
        }

        if (grade.equals("positive")) {
            finalSum = finalSum * 1.25;
        } else {
            finalSum = finalSum * 0.90;
        }

        System.out.printf("%.2f", finalSum);
    }
}
