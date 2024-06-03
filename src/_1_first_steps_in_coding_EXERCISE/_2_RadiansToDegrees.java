package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _2_RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());

        // градус = радиан * 180 / π
        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);
    }
}
