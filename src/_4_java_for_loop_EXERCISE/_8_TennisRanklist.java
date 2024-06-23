package _4_java_for_loop_EXERCISE;

import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGames = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());
        int pointsTournament = 0;
        int winCount = 0;

        for (int i = 0; i < countGames; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W" -> {
                    winCount += 1;
                    pointsTournament += 2000;
                }
                case "F" -> pointsTournament += 1200;
                case "SF" -> pointsTournament += 720;
            }
        }

        double pointsAverageTournament = Math.floor(pointsTournament / countGames);
        double winPercent = (1.0 * winCount / countGames) * 100;

        System.out.printf("Final points: %.0f\n", (pointsTournament + startPoints) * 1.0);
        System.out.printf("Average points: %.0f\n", pointsAverageTournament);
        System.out.printf("%.2f%%",winPercent);
    }
}
