package javaClass3;
//Write a program that prompts the user to enter two positive integers, start and end (where start < end).
// The program should generate and display all the prime numbers between start and end, inclusive.
//
//A prime number is a positive integer greater than 1 that has no positive divisors other than 1 and itself.
//
//Your program should use control structures (such as loops and conditional statements)
// to implement the logic for generating and checking prime numbers.
import java.util.Scanner;
public class PrimeNumberGenerator_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two positive integers start: ");
        int startNum = scanner.nextInt();
        System.out.println("enter two positive integers end: ");
        int endNum = scanner.nextInt();

        if(startNum < endNum){
            System.out.println("-");
            for (int i = startNum; i <= endNum; i++) {
                System.out.println(i);
            }

        }else {
            System.out.println("have to be where start < end");
        }


    }


}
