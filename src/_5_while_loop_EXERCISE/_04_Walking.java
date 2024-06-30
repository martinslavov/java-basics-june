package _5_while_loop_EXERCISE;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000;

        while (goal > 0) {
            String comm = scanner.nextLine();

            if (comm.equals("Going home")) {
                int stepsExtra = Integer.parseInt(scanner.nextLine());
                goal = goal - stepsExtra;
                break;
            }

            int steps = Integer.parseInt(comm);
            goal = goal - steps;
        }


        if (goal <= 0) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", Math.abs(goal));
        } else {
            System.out.printf("%d more steps to reach goal.", goal);
        }
    }
}
