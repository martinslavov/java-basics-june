package _4_java_for_loop_EXERCISE;

import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double actorPoints = Double.parseDouble(scanner.nextLine());
        int gradersCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= gradersCount; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            //actorPoints += (name.length() * points) / 2;
            actorPoints = actorPoints + (name.length() * points) / 2;

            // actorPoints = 1300
            if (actorPoints > 1250.5) {
                break;
            }
        }


        if (actorPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, actorPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, 1250.5 - actorPoints);
        }
    }
}