package _5_while_loop_EXERCISE;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGradesLimit = Integer.parseInt(scanner.nextLine());

        int sumGrades = 0;
        int gradesCount = 0;
        int badGradesCount = 0;
        String lastTaskName = "";
        boolean isBadGradesLimitReached = false;

        String command = scanner.nextLine();
        while (!command.equals("Enough")) {
            String taskName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                badGradesCount++;

                if (badGradesLimit == badGradesCount) {
                    isBadGradesLimitReached = true;
                    break;
                }
            }

            lastTaskName = taskName;
            sumGrades += grade;
            gradesCount++;

            command = scanner.nextLine();
        }

        if (isBadGradesLimitReached) {
            System.out.printf("You need a break, %d poor grades.", badGradesLimit);
        } else {
            System.out.printf("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", (1.0 * sumGrades) / gradesCount, gradesCount, lastTaskName);
        }
    }
}
