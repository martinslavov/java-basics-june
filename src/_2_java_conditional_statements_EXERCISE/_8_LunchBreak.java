package _2_java_conditional_statements_EXERCISE;

import java.util.Scanner;

public class _8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double restTime = breakTime / 4.0;
        double lunchTime = breakTime / 8.0;

        double remainingTime = breakTime - restTime - lunchTime;

        if (remainingTime >= seriesTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    seriesName, Math.ceil(remainingTime - seriesTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    seriesName, Math.ceil(seriesTime - remainingTime));
        }
    }
}
