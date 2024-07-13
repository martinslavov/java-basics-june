package _7_exam_preparation;

import java.util.Scanner;

public class _1_FruitMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());

        double bananasQuantity = Double.parseDouble(scanner.nextLine());
        double orangesQuantity = Double.parseDouble(scanner.nextLine());
        double raspberriesQuantity = Double.parseDouble(scanner.nextLine());
        double strawberriesQuantity = Double.parseDouble(scanner.nextLine());

        // пресмятания
        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice - raspberriesPrice * 0.40;
        double bananasPrice = raspberriesPrice - raspberriesPrice * 0.80;

        double bananasSum = bananasQuantity * bananasPrice;
        double orangesSum = orangesQuantity * orangesPrice;
        double raspberriesSum = raspberriesQuantity * raspberriesPrice;
        double strawberriesSum = strawberriesQuantity * strawberriesPrice;

        double totalSum = bananasSum + orangesSum + raspberriesSum + strawberriesSum;

        System.out.printf("%.2f", totalSum);

    }
}
