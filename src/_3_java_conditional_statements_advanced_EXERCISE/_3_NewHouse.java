package _3_java_conditional_statements_advanced_EXERCISE;

import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double finalSum = 0.0;
        switch (flowerType) {
            case "Roses" -> {
                finalSum = 5.0 * flowerCount;
                if (flowerCount > 80) {
                    finalSum = finalSum - (finalSum * 0.10);
                }
            }
            case "Dahlias" -> {
                finalSum = 3.80 * flowerCount;
                if (flowerCount > 90) {
                    finalSum = finalSum - (finalSum * 0.15);
                }
            }
            case "Tulips" -> {
                finalSum = 2.80 * flowerCount;
                if (flowerCount > 80) {
                    finalSum = finalSum - (finalSum * 0.15);
                }
            }
            case "Narcissus" -> {
                finalSum = 3.0 * flowerCount;
                if (flowerCount < 120) {
                    finalSum = finalSum + (finalSum * 0.15);
                }
            }
            case "Gladiolus" -> {
                finalSum = 2.50 * flowerCount;
                if (flowerCount < 80) {
                    finalSum = finalSum + (finalSum * 0.20);
                    // finalSum = finalSum * 1.20;
                }
            }
        }

        if (budget >= finalSum) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowerCount, flowerType, budget - finalSum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", finalSum - budget);
        }
    }
}
