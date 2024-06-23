package _4_java_for_loop_EXERCISE;

import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum = sum + number;
            // sum += number

            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        sum = sum - maxNumber;
        // sum -= maxNumber;

        if (maxNumber == sum) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            System.out.printf("No%nDiff = %d", Math.abs(sum - maxNumber));
        }
    }
}
