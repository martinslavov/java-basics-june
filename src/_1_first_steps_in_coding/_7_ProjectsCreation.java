package _1_first_steps_in_coding;

import java.util.Scanner;

public class _7_ProjectsCreation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int numberOfProjects = Integer.parseInt(scanner.nextLine());
        int hours = 3 * numberOfProjects;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, numberOfProjects );

    }
}
