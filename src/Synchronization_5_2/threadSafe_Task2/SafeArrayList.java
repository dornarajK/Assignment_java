package Synchronization_5_2.threadSafe_Task2;

import Synchronization_5_2.ticketReservationSystem_Task1.Theater;

import java.util.ArrayList;

public class SafeArrayList {
    private ArrayList<String> list;

    public SafeArrayList() {
        list = new ArrayList<>();
    }

    public synchronized void add(String element) {
        list.add(element);
    }

    public synchronized void remove(String value) {
        if(list.remove(value)){
            System.out.println(Thread.currentThread().getName()
                    + " removed: " + value);
        }else {
            System.out.println("Element " + value + " not found in the list.");
        }

    }

    public synchronized int getSize(){
        return list.size();
    }



}
