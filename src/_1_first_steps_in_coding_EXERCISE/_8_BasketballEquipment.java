package _1_first_steps_in_coding_EXERCISE;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualFee - (0.40  * annualFee);
        // shoesPrice = annualFee * 0.60;
        double setPrice = shoesPrice - (0.20 * shoesPrice);
        // double setPrice = shoesPrice * 0.80;
        double ballPrice = setPrice * 1/4;
        double accPrice = ballPrice * 1/5;

        System.out.println(annualFee + shoesPrice + setPrice + ballPrice + accPrice);
    }
}
