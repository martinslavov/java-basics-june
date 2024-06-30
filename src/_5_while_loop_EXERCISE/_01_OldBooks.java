package _5_while_loop_EXERCISE;

import java.util.Scanner;

public class _01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String annysBook = scanner.nextLine();

        int booksCount = 0;
        while (true) {
            String book = scanner.nextLine();

            if (book.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n" +
                        "You checked %d books.", booksCount);
                break;
            }

            if (annysBook.equals(book)) {
                System.out.printf("You checked %d books and found it.", booksCount);
                break;
            }
            booksCount++;

        }
    }
}
