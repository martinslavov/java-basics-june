package _6_nested_loops;

import java.util.Scanner;

public class _04_SumOfTwoNumbers {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean isThereValidCombination = false;
        for (int firstNumber = start; firstNumber <= end ; firstNumber++) {
            for (int secondNumber = start; secondNumber <= end ; secondNumber++) {

                count++;

                int sum = firstNumber + secondNumber;
                if (sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)",
                            count, firstNumber, secondNumber, magicNumber );

                    isThereValidCombination = true;
                    break;
                }
            }

            if (isThereValidCombination){
                break;
            }

        }

        if (!isThereValidCombination){
            System.out.printf("%d combinations - neither equals %d",
                    count, magicNumber);
        }


    }
}
