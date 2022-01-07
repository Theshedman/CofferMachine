import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        final int firstPosition = 1;
        final int secondPosition = 2;
        final int thirdPosition = 3;

        int[] maxPosition = {a, firstPosition};

        if (b > maxPosition[0]) {
            maxPosition[0] = b;
            maxPosition[1] = secondPosition;
        }
        if (c > maxPosition[0]) {
            maxPosition[0] = c;
            maxPosition[1] = thirdPosition;
        }

        return maxPosition[1];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}
