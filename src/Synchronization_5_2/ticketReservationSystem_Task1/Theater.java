package Synchronization_5_2.ticketReservationSystem_Task1;

public class Theater {
    private int availabSeats;

    public Theater (int availabSeats){
        this.availabSeats = availabSeats;
    }

    // vaan yksi voi varata keralaan
    public synchronized void reserveSeats(int customerId, int requestedSeats){
        if(requestedSeats <= availabSeats){
            availabSeats -= requestedSeats;
            System.out.println("Customer " + customerId + " reserved " + requestedSeats);
        } else {
            System.out.println("Customer " + customerId + " failed to reserve " + requestedSeats + " seats. Not enough seats available.");

        }

    }

    public int getAvailableSeats(){
        return availabSeats;
    }





}
