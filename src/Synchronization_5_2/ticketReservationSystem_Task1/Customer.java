package Synchronization_5_2.ticketReservationSystem_Task1;

import java.util.concurrent.ThreadLocalRandom;

public class Customer implements Runnable {
    private int customerId;
    private Theater theater;

    public Customer( Theater theater, int customerId){
        this.theater = theater;
        this.customerId = customerId;
    }


    public void run(){
        int reserve = ThreadLocalRandom.current().nextInt(1, 5);
        theater.reserveSeats(customerId, reserve);

    }




}
