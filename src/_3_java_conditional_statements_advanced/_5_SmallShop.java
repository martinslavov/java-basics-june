package _3_java_conditional_statements_advanced;

import java.util.Scanner;

public class _5_SmallShop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine(); // закупен продукт
        String town = scanner.nextLine(); // град

        double quantity = Double.parseDouble(scanner.nextLine()); // количество

        double price = 0; // тук ще държа единичната цена напродукта

        // 1. проверка за града -> Sofia, Plovdiv, Varna
        switch (town) {
            case "Sofia" -> {
                if (product.equals("coffee")) {
                    price = 0.50;
                } else if (product.equals("water")) {
                    price = 0.80;
                } else if (product.equals("beer")) {
                    price = 1.20;
                } else if (product.equals("sweets")) {
                    price = 1.45;
                } else if (product.equals("peanuts")) {
                    price = 1.60;
                }
            }
            case "Plovdiv" -> {
                if (product.equals("coffee")) {
                    price = 0.40;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.15;
                } else if (product.equals("sweets")) {
                    price = 1.30;
                } else if (product.equals("peanuts")) {
                    price = 1.50;
                }
            }
            case "Varna" -> {
                if (product.equals("coffee")) {
                    price = 0.45;
                } else if (product.equals("water")) {
                    price = 0.70;
                } else if (product.equals("beer")) {
                    price = 1.10;
                } else if (product.equals("sweets")) {
                    price = 1.35;
                } else if (product.equals("peanuts")) {
                    price = 1.55;
                }
            }
        }

        double totalPrice = quantity * price;
        System.out.println(totalPrice);

    }

}
