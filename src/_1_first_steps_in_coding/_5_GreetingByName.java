package _1_first_steps_in_coding;

import java.util.Scanner;

public class _5_GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

        System.out.println("Hello, " + name + "!");

    }
}
