package javaClass3;
import java.util.Scanner;
//Write a program that prompts the user to enter the coefficients
// of a quadratic equation(ax^2 + bx + c = 0) and calculates its roots using the quadratic formula.
// Display
//the roots on the console. If the equation
// has no real roots, display the message "No real roots".

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients\n" + "a:");
        double a = scanner.nextInt();
        System.out.print("Enter the coefficients\n" + "b:");
        double b = scanner.nextInt();
        System.out.print("Enter the coefficients\n" + "c:");
        double c = scanner.nextInt();

        double d = b * b - 4 * a * c;
        if (d > 0){
            // Kaksi reaalijuurta
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("juuret ovat: " + r1 + "ja" + r2);

        } else if (d == 0) {
            // Yksi reaalijuuri
            double r = -b / (2 * a);
            System.out.println("Juuri on: " + r);

        }else {
            // Negatiivinen diskriminantti
            System.out.println("No real roots");
        }


    }
}
