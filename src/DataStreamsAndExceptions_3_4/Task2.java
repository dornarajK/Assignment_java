package DataStreamsAndExceptions_3_4;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        int n = 60;

        try{
            FileWriter writer = new FileWriter("fibonacci.csv");
            writer.append("Index;Value\n");

            long a = 0;
            long b = 1;
            for (int i = 0; i < n ; i++){
                writer.append(i + ";" + a + "\n");
                long next = a + b;
                a = b;
                b = next;
            }
            writer.close();


        }catch (IOException e){
            e.printStackTrace();

        }
    }
}
