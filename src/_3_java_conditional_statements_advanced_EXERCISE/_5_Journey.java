package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String country = "";
        String place = "";
        double price = 0.0;
        if (budget <= 100) {
            country = "Bulgaria";
            if(season.equals("summer")) {
                place = "Camp";
                price = budget * 0.30;
            } else {
                place = "Hotel";
                price = budget * 0.70;
            }
        }
        else if(budget <= 1000) {
            country = "Balkans";
            if(season.equals("summer")) {
                place = "Camp";
                price = budget * 0.40;
            } else {
                place = "Hotel";
                price = budget * 0.80;
            }
        }
        else if (budget > 1000) {
            country = "Europe";
            place = "Hotel";
            price = budget * 0.90;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", country, place, price);

    }
}
