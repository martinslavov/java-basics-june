package _3_java_conditional_statements_advanced;

import java.util.Scanner;

public class _6_NumberInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number >= -100 && number <= 100 && number != 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }


}
