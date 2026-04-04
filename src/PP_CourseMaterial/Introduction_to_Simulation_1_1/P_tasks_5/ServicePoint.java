package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_5;

import PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6.Customer;

import java.beans.IntrospectionException;
import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer> queue = new LinkedList<>();

    public void addToQueue(Customer a){
        queue.addFirst(a);
    }
    public Customer removeFormQueue(){
        return queue.removeLast();
    }
    public boolean queueEmpty(){
        return queue.isEmpty();
    }

    public void serve() throws IntrospectionException, InterruptedException {
        System.out.println("= Serves start =");

        while (!queueEmpty()){
            Customer customer = removeFormQueue();
            customer.setStartTime(System.nanoTime());

            long sleepTime = 500 + (long) (Math.random() * 1000);
            System.out.println("Sergign: "+ customer + "Time: "+sleepTime );
            Thread.sleep(sleepTime);

            customer.setEndTime(System.nanoTime());

            System.out.println("response time: " + customer.getResponseTime());
            System.out.println("Waitign time: " + customer.getWaitingTime());
            System.out.println("service time: " + customer.getTimeSpend());

        }
    }



}
