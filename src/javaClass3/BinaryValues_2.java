package javaClass3;
import java.util.Scanner;
//Write a program that prompts the user to enter a binary number
// (composed of 0s and 1s) and converts it to decimal. Display the decimal equivalent
// on the console. Hint: use the charAt
// method of the String class to retrieve the individual bits in the input string.

public class BinaryValues_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = 0;
        int power = 0;

        for (int i = binary.length() -1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if(bit == '1'){
                decimal += Math.pow(2, power);

            }else if(bit != '0'){
                System.out.println("Invalid binary number!");
                return;

            }
            power++;

            
        }
        // Output result
        System.out.println("Decimal equivalent: " + decimal);




    }
}
