package _3_java_conditional_statements_advanced;

import java.util.Scanner;

public class _4_PersonalTitles {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        // 1. Проверка за пол-а
        if (gender.equals("m")){
            // мъж
            // проверка за възрастта
            if (age >= 16){
                System.out.println("Mr.");
            } else {
                System.out.println("Master");
            }

        } else if (gender.equals("f")) {
            // жена
            // проверка за възрастта
            if (age >= 16){
                System.out.println("Ms.");
            } else {
                System.out.println("Miss");
            }
        }

    }
}
