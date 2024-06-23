package _4_java_for_loop_EXERCISE;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());

        int countAllPeople = 0;
        int countMusala = 0;
        int countMonblanc = 0;
        int countKilimandjaro = 0;
        int countK2 = 0;
        int countEverest = 0;

        for (int i = 0; i < groupsCount ; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());
            countAllPeople += peopleInGroup;

            if(peopleInGroup <= 5) {
                countMusala += peopleInGroup;
            } else if(peopleInGroup > 5 && peopleInGroup <= 12) {
                countMonblanc += peopleInGroup;
            } else if(peopleInGroup > 12 && peopleInGroup <= 25) {
                countKilimandjaro += peopleInGroup;
            } else if(peopleInGroup > 25 && peopleInGroup <= 40) {
                countK2 += peopleInGroup;
            } else {
                countEverest += peopleInGroup;
            }
        }

        System.out.printf("%.2f%%%n",(1.0 * countMusala/countAllPeople) * 100.0);
        System.out.printf("%.2f%%%n",(1.0 * countMonblanc/countAllPeople) * 100.0);
        System.out.printf("%.2f%%%n",(1.0 * countKilimandjaro/countAllPeople) * 100.0);
        System.out.printf("%.2f%%%n",(1.0 * countK2/countAllPeople) * 100.0);
        System.out.printf("%.2f%%",(1.0 * countEverest/countAllPeople) * 100.0);

    }
}

