package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double studio = 0.0;
        double apartment = 0.0;
        if (season.equals("May") || season.equals("October")) {
            studio = nights * 50.0;
            apartment = nights * 65.0;

            if (nights > 7 && nights <= 14) {
                studio = studio * 0.95;
            } else if (nights > 14) {
                studio = studio * 0.70;
                apartment = apartment * 0.90;
            }

        } else if (season.equals("June") || season.equals("September")) {
            studio = nights * 75.2;
            apartment = nights * 68.70;

            if (nights > 14) {
                studio = studio * 0.80;
                apartment = apartment * 0.90;
            }
        } else if (season.equals("July") || season.equals("August")) {
            studio = nights * 76.0;
            apartment = nights * 77.0;

            if (nights > 14) {
                apartment = apartment * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);
    }
}
