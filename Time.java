package hw1;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter seconds:");
        int seconds = in.nextInt();

        int hour = seconds / 3600;
        int remain = seconds % 3600;
        int min = remain / 60;
        int sec = remain % 60;

        System.out.println("hours:" + hour + " minutes:" + min + " seconds:" + sec);
    }
}

