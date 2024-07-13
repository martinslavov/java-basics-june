package _7_exam_preparation;

import java.util.Scanner;

public class _4_FoodForPets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDays = Integer.parseInt(scanner.nextLine());
        double totalFood = Double.parseDouble(scanner.nextLine());

        double sumBiscuits = 0;
        double sumFoodEatenByDog = 0;
        double sumFoodEatenByCat = 0;

        for (int day = 1; day <= countDays ; day++) {
            int foodEatenByDog = Integer.parseInt(scanner.nextLine());
            int foodEatenByCat = Integer.parseInt(scanner.nextLine());

            if (day % 3 == 0){
                sumBiscuits += (foodEatenByDog + foodEatenByCat) * 0.10;
            }

//            sumFoodEatenByDog = sumFoodEatenByDog + foodEatenByDog;
            sumFoodEatenByDog += foodEatenByDog;
            sumFoodEatenByCat += foodEatenByCat;

        }

        double sumFoodEatenByDogAnaCat = sumFoodEatenByCat + sumFoodEatenByDog;

        double percentageEatenFood = (sumFoodEatenByDogAnaCat / totalFood) * 100;
        double percentageEatenFoodByDog = (sumFoodEatenByDog / sumFoodEatenByDogAnaCat) * 100;
        double percentageEatenFoodByCat = (sumFoodEatenByCat / sumFoodEatenByDogAnaCat) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(sumBiscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageEatenFoodByCat);




    }
}
