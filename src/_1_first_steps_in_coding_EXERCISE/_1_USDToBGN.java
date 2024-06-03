package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _1_USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double usd = Double.parseDouble(input);

        // 1 USD = 1.79549 BGN
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}