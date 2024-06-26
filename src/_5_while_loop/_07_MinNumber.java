package _5_while_loop;

import java.util.Scanner;

public class _07_MinNumber {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;

        String input  = scanner.nextLine();
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (number < min){
                min = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(min);


    }
}
