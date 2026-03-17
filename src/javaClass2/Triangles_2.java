package javaClass2;
import java.util.Scanner;
//Write a program that asks
// the user for the lengths of the
// legs of a right triangle and prints the length of the
// hypotenuse of the triangle.

public class Triangles_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double leftLeg = 3;
        System.out.print("Enter a lengths of the legs of a right triangle: ");
        double rightLeg = scanner.nextInt();

        double hypotenuse = Math.sqrt(leftLeg * leftLeg + rightLeg * rightLeg);
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    }
}
