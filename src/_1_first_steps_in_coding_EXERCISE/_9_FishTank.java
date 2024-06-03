package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeInSm = length * width * height;
        // 1l = 1dm3
        // 1dm = 10sm
        // 1dm3 = 10sm * 10sm * 10sm = 1000sm3
        // 1l = 1000sm3

        double volumeInLiters = volumeInSm / 1000.0;
        double volumeFinal = volumeInLiters - ((percent/100) * volumeInLiters);

        System.out.println(volumeFinal);
    }
}
