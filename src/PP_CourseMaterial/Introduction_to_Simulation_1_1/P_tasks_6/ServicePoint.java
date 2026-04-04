package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6;



import java.beans.IntrospectionException;
import java.util.LinkedList;

public class ServicePoint {
    LinkedList<Customer> queue = new LinkedList<>();

    private long totalServiceTime = 0;
    private int customersServed = 0;

    public void addToQueue(Customer a){
        queue.addFirst(a);
    }

    public Customer removeFormQueue(){
        return queue.removeLast();
    }
    public boolean queueEmpty(){
        return queue.isEmpty();
    }

    public double getAverageServiceTime() {
        if (customersServed == 0) return 0;
        return (double) totalServiceTime / customersServed;
    }

    public int getCustomersServed() {
        return customersServed;
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
            totalServiceTime += customer.getTimeSpend();
            customersServed++;
            System.out.println("response time: " + customer.getResponseTime());
            System.out.println("Waitign time: " + customer.getWaitingTime());
            System.out.println("service time: " + customer.getTimeSpend());

        }

        System.out.println("Average service time " + getAverageServiceTime() + customersServed);
    }
    public void reset() {
        queue.clear();
        totalServiceTime = 0;
        customersServed = 0;
    }


}
