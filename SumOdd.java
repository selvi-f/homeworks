package hw1;
import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("First number: ");
        int a = in.nextInt();

        System.out.print("Second number: ");
        int b = in.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0;

        for (int i = start + 1; i < end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Sum of odd numbers between them: " + sum);
    }
}
