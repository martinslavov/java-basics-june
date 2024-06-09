package _2_java_conditional_statements_EXERCISE;

import java.util.Scanner;

public class _1_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int sumAllSeconds = firstTime + secondTime + thirdTime;

        int minutes = sumAllSeconds / 60;
        int seconds = sumAllSeconds % 60;

        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
