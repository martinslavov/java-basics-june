package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        double finalPrice = 0.0;

        switch (movieName) {
            case "Premiere" -> finalPrice = 12.00 * seats;
            case "Normal" -> finalPrice = 7.50 * seats;
            case "Discount" -> finalPrice = 5.00 * seats;
        }

        System.out.printf("%.2f leva", finalPrice);

    }
}
