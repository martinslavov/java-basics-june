package _7_exam_preparation;

import java.util.Scanner;

public class _2_FamilyTrip {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        int percentAdditionalMoney = Integer.parseInt(scanner.nextLine());

        // проверка дали нощъвките са повече от 7
        if (days > 7) {
            pricePerDay = pricePerDay - (pricePerDay * 0.05);
        }

        // изчисляваме цената за всички нощувки
        double priceForAllDays = days * pricePerDay;

        // изчисляване на допълнителни разходи
        double additionalMoney = (percentAdditionalMoney / 100.00) * budget;

        // тук изчисляваме всички пари които ни трябват
        double neededMoney = priceForAllDays + additionalMoney;

        // изчисляваме разликата
        double diff = Math.abs(neededMoney - budget);

        if (budget >= neededMoney){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }


    }
}
