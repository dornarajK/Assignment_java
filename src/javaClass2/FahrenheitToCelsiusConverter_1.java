package javaClass2;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first Fahrenheit number: ");
        double fahrenheit  = scanner.nextDouble();

        double celsius  = (( 5 *(fahrenheit - 32.0)) / 9.0);


        System.out.print("celsius "+  celsius );

        scanner.close();
    }

}
