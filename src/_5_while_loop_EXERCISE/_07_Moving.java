package _5_while_loop_EXERCISE;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = length * width * height;

        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            volume = volume - boxes;
            // volume -= boxes;

            if (volume <= 0) {
                break;
            }

            command = scanner.nextLine();
        }

        if (volume <= 0) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        } else {
            System.out.printf("%d Cubic meters left.", volume);
        }

    }
}
