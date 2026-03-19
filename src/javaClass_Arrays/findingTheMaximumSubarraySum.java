package javaClass_Arrays;
import java.util.Scanner;
public class findingTheMaximumSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                int sum = 0;

                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    startIndex = i;
                    endIndex = j;
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (startIndex + 1) + "-" + (endIndex + 1));

        scanner.close();

    }
}
