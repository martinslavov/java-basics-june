package _5_while_loop_EXERCISE;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());

        int cakePieces = length * width;

        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int pieces = Integer.parseInt(command);
            cakePieces -= pieces;

            if (cakePieces <= 0) {
                break;
            }

            command = scanner.nextLine();
        }

        if (cakePieces > 0) {
            System.out.printf("%d pieces are left.", cakePieces);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
        }
    }
}
