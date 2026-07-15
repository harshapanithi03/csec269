import java.util.Scanner;

public class Median {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] a = new int[n1];

        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] b = new int[n2];

        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < n1) {
            merged[k++] = a[i++];
        }

        while (j < n2) {
            merged[k++] = b[j++];
        }

        System.out.print("Merged array: ");
        for (int value : merged) {
            System.out.print(value + " ");
        }

        int n = merged.length;
        double median;

        if (n == 0) {
            System.out.println("\nArrays are empty.");
            return;
        }

        if (n % 2 == 0) {
            median = (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        } else {
            median = merged[n / 2];
        }

        System.out.println("\nMedian = " + median);

        sc.close();
    }
}