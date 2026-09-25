package hw1;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double min = Double.MAX_VALUE;
        double max = -Double.MAX_VALUE;

        while (in.hasNextDouble()) {
            double num = in.nextDouble();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
