package _2_java_conditional_statements_EXERCISE;

import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());

        double swimmingTime = distance * timeFor1Meter;
        double sectorsForSlowing = Math.floor(distance / 15);

        double slowingTime = sectorsForSlowing * 12.5;
        swimmingTime = swimmingTime + slowingTime;

        if (swimmingTime < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", swimmingTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", swimmingTime - record);
        }
    }
}
