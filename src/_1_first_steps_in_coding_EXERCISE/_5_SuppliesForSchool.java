package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _5_SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pensCount = Integer.parseInt(scanner.nextLine());
        int markersCount = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());

        double pensPrice = 5.80 * pensCount;
        double markersPrice = 7.20 * markersCount;
        double detergentPrice = 1.20 * detergentLiters;
        double sumAll = pensPrice + markersPrice + detergentPrice;

        double sumFinal = sumAll - ((discountPercent/100.0) * sumAll);

        System.out.println(sumFinal);
    }
}