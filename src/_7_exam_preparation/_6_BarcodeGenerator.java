package _7_exam_preparation;

import java.util.Scanner;

public class _6_BarcodeGenerator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String start = scanner.nextLine();
        String end = scanner.nextLine();

        int firstStart = Integer.parseInt(start.substring(0, 1));
        int secondStart = Integer.parseInt(start.substring(1, 2));
        int thirdStart = Integer.parseInt(start.substring(2, 3));
        int forthStart = Integer.parseInt(start.substring(3, 4));

        int firstEnd = Integer.parseInt(end.substring(0, 1));
        int secondEnd = Integer.parseInt(end.substring(1, 2));
        int thirdEnd = Integer.parseInt(end.substring(2, 3));
        int forthEnd = Integer.parseInt(end.substring(3, 4));

        for (int i = firstStart; i <= firstEnd ; i++) {

            for (int j = secondStart; j <= secondEnd ; j++) {

                for (int k = thirdStart; k <= thirdEnd ; k++) {

                    for (int l = forthStart; l <= forthEnd ; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 !=0 && l % 2 != 0 ){
                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");
                        }

                    }

                }

            }

        }

    }
}
