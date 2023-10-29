package school.mjc.stage0.module3.task4;

import java.util.Scanner;

public class FormulaCreator {
    public static void main(String[] args) {


        double a = 2;
        double b = 5;

        double aSquared = a * a;
        double powerTerm = 9 * aSquared;
        double result = ((powerTerm - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2));


        System.out.println("Result: " + result);
    }
}
