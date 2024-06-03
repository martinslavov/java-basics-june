package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _4_VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysCount = Integer.parseInt(scanner.nextLine());

        int allHoursToRead = allPages / pagesPerHour;
        int hoursPerDay = allHoursToRead / daysCount;

        System.out.println(hoursPerDay);
    }
}
