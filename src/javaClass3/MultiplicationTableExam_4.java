package javaClass3;
//In primary school, students must memorize the multiplication tables for numbers 1 to 10.
// Create a program to assist primary school students that presents the user with ten randomly
// generated multiplication problems, where the factors are integers between one and ten. After each answer,
// the program indicates whether it was correct or not. The user receives one point for each correctly
// answered question. If the user scores ten points for the entire set of problems, the program congratulates
// them on mastering the multiplication tables and terminates. Otherwise, the program starts a new set of problems.
//
//Hint: Random number can be generated with Math.random().
//
//Below is a code that returns a random number between 1 and 10.
//
//int luku = (int) (Math.random() * 10) + 1;

import java.sql.SQLOutput;
import java.util.Scanner;
public class MultiplicationTableExam_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int point = 0;
        while (num < 10) {
            num +=1;
            System.out.println("___");
            System.out.println("kysymys: " +num);


            // Lasku
            int luku1 = (int) (Math.random() * 10) + 1;
            int luku2= (int) (Math.random() * 10) + 1;

            // oikea vastaus
            int lasku = luku1 * luku2;
            //System.out.println("Vastaus on: " + lasku);

            // Kysytään opiskelijalta
            System.out.printf("%d * %d = ", luku1, luku2);
            int vastaus = scanner.nextInt();

            // kerrotan opiskeljalta vastaus oikein vai väärin
            if (lasku == vastaus){
                System.out.println("Oikein");
                System.out.println("Point: +1 ");
                point += 1;

                System.out.println("Sinulla on: " + point + " point");
                if(point == 10){
                    System.out.println("congratulates for mastering the multiplication tables ");
                }
            }else{
                System.out.println("väärin");
                // Näytetään oikea vastaus ja opiskeljan vastaus
                System.out.printf("Oikea vastaus: %d  ", lasku);
                System.out.println("\n");
                System.out.println("pisteet on: " + point);

            }


            System.out.println("\n");

            if (num == 10){
                System.out.println("sinun pisteet oli " + point);
                point = 0;
                num = 0;

                System.out.println("Aloitetaan udeleen");

            }

        }


    }
}
