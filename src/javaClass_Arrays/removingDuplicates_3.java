package javaClass_Arrays;
import java.util.Scanner;
public class removingDuplicates_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int sizeArray = scanner.nextInt();

        int[] arr = new int[sizeArray];

        System.out.println("Enter the integers into the array:");
        // user enter number
        for (int i = 0; i < sizeArray; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // new array
        int[] unique = new int[sizeArray];
        int uniqueCount = 0;

        // remove duplicates
        for (int i = 0; i < sizeArray; i++){
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == unique[j]){
                    isDuplicate = true;
                    break;
                }

            }

            if (!isDuplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }

        scanner.close();



    }
}
