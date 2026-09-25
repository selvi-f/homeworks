package hw1;
public class Average {
    public static void main(String[] args) {

        int sum = 0;
        int n = args.length;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(args[i]);
        }

        int average = sum / n;

        System.out.println("Average = " + average);
    }
}
