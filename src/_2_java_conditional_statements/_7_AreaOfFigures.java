package _2_java_conditional_statements;

import java.util.Scanner;

public class _7_AreaOfFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();

        double area = 0;
        if("square".equals(typeFigure)){
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if ("rectangle".equals(typeFigure)) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            area = length * width;
        } else if ("circle".equals(typeFigure)) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if ("triangle".equals(typeFigure)) {
            double base = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = base * height / 2;
        }

        System.out.printf("%.3f", area);

    }
}
