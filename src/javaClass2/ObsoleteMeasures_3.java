package javaClass2;
import java.util.Scanner;

//One leiviskä is 20 naula.
//One naula is 32 luoti.
//One luoti is 13.28 grams.
//Write a program that asks the user for a weight in grams and converts it to medieval measurements:
//leiviskä, naula, and luoti. The program should work in the following way:
//Weight (g): 30000
//30000 grams is 3 leiviskä, 10 naula, and 19.04 luoti.

public class ObsoleteMeasures_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kysy
        System.out.print("Enter a Weight (g): ");
        double weight = scanner.nextInt();

        // tiedot ja muuntokerroin
        double luoti = 13.28;
        double naula = 32 * luoti;
        double leiviska = 20 * naula;

        int leiviskaCount = (int)(weight / leiviska);
        double remainingAfterLeiviska = weight % leiviska;

        int naulaCount = (int)(remainingAfterLeiviska / naula);
        double remainingAfterNaula = remainingAfterLeiviska % naula;

        double luotiCount = remainingAfterNaula / luoti;
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n", weight, leiviskaCount, naulaCount, luotiCount);

        scanner.close();








    }
}
