package _1_first_steps_in_coding;

import java.util.Scanner;

public class _9_YardGreening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double sqrMeters = Double.parseDouble(scanner.nextLine());
        double amount =  sqrMeters * 7.61;

        double discount = amount * 18 / 100;

        double sumAfterDiscount = amount - discount;

//        System.out.printf("The final price is: %f lv.%n", sumAfterDiscount);
//        System.out.printf("The discount is: %f lv.", discount);

         System.out.printf("The final price is: %.2f lv.%n", sumAfterDiscount);
         System.out.printf("The discount is: %.2f lv.", discount);


    }
}
