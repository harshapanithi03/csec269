import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dividend = sc.nextDouble();
        double divisor = sc.nextDouble();

        double low = dividend;
        double high = divisor;

        while (high - low > 0.000001) {
            double mid = low + (high - low) / 2;

            if (mid * divisor < dividend) {
                low = mid;
            } else {
                high = mid;
            }
        }

        System.out.println((low + high) / 2);
    }
}