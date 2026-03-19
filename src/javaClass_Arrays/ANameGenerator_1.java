package javaClass_Arrays;
import java.util.Scanner;

public class ANameGenerator_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstName = {"kun", "Bum", "yum", "Gam"};
        String[] lastName = {"dan", "zum", "minko", "lumb"};

        System.out.print("how many random names: ");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++){
            int randomFirstName = (int) (Math.random() * firstName.length);
            int randomLastName  = (int) (Math.random() * lastName.length);
            String fullName = firstName[randomFirstName] + " " + lastName[randomLastName ];
            System.out.println(fullName);



        }

    }
}
