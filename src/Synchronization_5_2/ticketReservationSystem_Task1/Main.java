package Synchronization_5_2.ticketReservationSystem_Task1;

import Synchronization_5_2.ticketReservationSystem_Task1.Customer;
import Synchronization_5_2.ticketReservationSystem_Task1.Theater;

public class Main {
    public static void main(String[] args) {

        // total seats in theater
        Theater theater = new Theater(10);

        // create multiple customers
        Thread[] customers = new Thread[15];

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Thread(new Customer(theater, i + 1));
        }

        // start all threads
        for (Thread t : customers) {
            t.start();
        }

        // wait for all threads to finish
        for (Thread t : customers) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nRemaining seats: " + theater.getAvailableSeats());
    }
}