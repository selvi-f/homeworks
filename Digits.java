package hw1;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        n = Math.abs(n);

        int sum = 0;
        int product = 1;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            count++;
            n /= 10;
        }

        int average = sum / count;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + average);
    }
}