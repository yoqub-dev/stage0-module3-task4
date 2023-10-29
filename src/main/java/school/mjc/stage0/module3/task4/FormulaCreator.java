package school.mjc.stage0.module3.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {


        double a = 1;
        double b = 2;

        double aSquared = a * a;
        double result = ((9 * aSquared - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));

        System.out.println("Result: " + result);
    }
}
