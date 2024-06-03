package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int depositDue = Integer.parseInt(scanner.nextLine());
        double annualPercent = Double.parseDouble(scanner.nextLine());

        // сума = депозирана сума  + срок на депозита
        // * ((депозирана сума * годишен лихвен процент ) / 12)

        double monthlyInterest = (depositSum * (annualPercent/100)) / 12;
        double sum = depositSum + depositDue * monthlyInterest;

        System.out.println(sum);
    }
}