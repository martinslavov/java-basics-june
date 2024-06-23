package _4_java_for_loop_EXERCISE;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        int sum = 0;
        int savedMoneyTracker = 10;

        for (int i = 1; i <= years; i++) {

            if (i % 2 == 0) {
                sum += savedMoneyTracker;
                --sum;

                savedMoneyTracker += 10;
            }
            else {
                toysCount++;
            }
        }

        int toysSum = toyPrice * toysCount;
        sum = sum + toysSum;


        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", sum - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - sum);
        }
    }
}