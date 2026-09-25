package hw1;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = in.nextInt();

        System.out.print("Enter second integer: ");
        int b = in.nextInt();

        System.out.println("Sum: " + (a + b));
    }
}
