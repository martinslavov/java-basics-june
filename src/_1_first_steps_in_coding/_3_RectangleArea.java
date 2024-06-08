package _1_first_steps_in_coding;

import java.util.Scanner;

public class _3_RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        int area = firstNumber * secondNumber;

        System.out.println(area);


    }
}
