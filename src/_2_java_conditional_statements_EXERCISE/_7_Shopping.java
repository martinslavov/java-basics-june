package _2_java_conditional_statements_EXERCISE;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsCount = Integer.parseInt(scanner.nextLine());
        int processorsCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCardsCount * 250.0;
        double processorsPrice = (videoCardsPrice * 0.35) * processorsCount;
        double ramsPrice = (videoCardsPrice * 0.10) * ramCount;

        double totalSum = videoCardsPrice + processorsPrice + ramsPrice;

        if (videoCardsCount > processorsCount) {
            totalSum = totalSum - (0.15 * totalSum);
        }

        double diff = Math.abs(budget - totalSum);
        if (budget >= totalSum) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }
    }
}
