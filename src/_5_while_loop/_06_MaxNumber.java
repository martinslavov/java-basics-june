package _5_while_loop;

import java.util.Scanner;

public class _06_MaxNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        String input  = scanner.nextLine();
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            // правя проверка дали е макс
            if (number > max){
                max = number;
            }

            input = scanner.nextLine();
        }

        System.out.println(max);


    }

}
