package _7_exam_preparation;

import java.util.Scanner;

public class _3_MovieDestination {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0.0;
        if (season.equals("Summer")){
            if (destination.equals("Dubai")){
                totalPrice = days * 40000 - (days * 40000) * 0.30;
            } else if (destination.equals("Sofia")) {
                totalPrice = days * 12500 + (days * 12500) * 0.25;
            } else if (destination.equals("London")) {
                totalPrice = days * 20250;
            }
        } else {
            if (destination.equals("Dubai")){
                totalPrice = days * 45000 - (days * 45000) * 0.30;
            } else if (destination.equals("Sofia")) {
                totalPrice = days * 17000 + (days * 17000) * 0.25;
            } else if (destination.equals("London")) {
                totalPrice = days * 24000;
            }
        }

        if (budget >= totalPrice){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!",
                    (budget - totalPrice));
        } else {
            System.out.printf("The director needs %.2f leva more!",
                    (totalPrice - budget));
        }

    }
}
