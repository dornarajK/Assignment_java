package DataStreamsAndExceptions_3_4;

import java.io.*;
import java.net.*;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class Task1 {

    public static void main(String[] args) {

        String urlString = "https://users.metropolia.fi/~jarkkov/temploki.csv";

        double sum = 0;
        int count = 0;


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDate targetDate = LocalDate.of(2023, 1, 1);

        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );

            String line;


            String headerLine = reader.readLine();
            System.out.println("HEADER: " + headerLine);

            if (headerLine == null) {
                System.out.println("Empty file");
                return;
            }

            String[] headers = headerLine.split(";");
            int ulkoTaloIndex = -1;
            int dateIndex = -1;


            for (int i = 0; i < headers.length; i++) {
                if (headers[i].trim().equalsIgnoreCase("UlkoTalo")) {
                    ulkoTaloIndex = i;
                }
                if (headers[i].toLowerCase().contains("aika")) {
                    dateIndex = i;
                }
            }

            for (int i = 0; i < headers.length; i++) {
                System.out.println(i + ": " + headers[i]);
            }

            if (ulkoTaloIndex == -1 || dateIndex == -1) {
                System.out.println("Required columns not found!");
                return;
            }


            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");

                if (parts.length <= Math.max(ulkoTaloIndex, dateIndex)) continue;

                String dateTime = parts[dateIndex];

                try {
                    LocalDateTime parsedDate = LocalDateTime.parse(dateTime, formatter);

                    if (parsedDate.toLocalDate().equals(targetDate)) {
                        double temp = Double.parseDouble(parts[ulkoTaloIndex]);
                        sum += temp;
                        count++;
                    }

                } catch (Exception e) {

                }
            }

            reader.close();

            if (count > 0) {
                double average = sum / count;
                System.out.println("Average temperature on 01.01.2023: " + average);
            } else {
                System.out.println("No data found for the given date.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}