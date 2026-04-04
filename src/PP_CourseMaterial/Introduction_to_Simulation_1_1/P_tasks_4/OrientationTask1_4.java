package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_4;


import java.util.LinkedList;
import java.util.Scanner;
/// Task 4
public class OrientationTask1_4 {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Customer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("queue/dequeue");

        while (true){
            System.out.println("Commands: 'a' = add | 'r' = remove | 'q'= quit ");
            System.out.println("Your command: ");
            String input = scanner.nextLine().trim().toLowerCase();

            switch (input) {
                case "a":
                    Customer newCustomer = new Customer();
                    newCustomer.setStrtTime(System.nanoTime());
                    queue.addFirst(newCustomer);
                    System.out.println(newCustomer +" joinend the queue.");
                    break;

                case "r":
                    if(queue.isEmpty()){
                        System.out.println("que is empty");
                    }
                    else {
                        Customer served = queue.removeLast();
                        served.setEndTime(System.nanoTime());

                        long timeInQueue = served.getTimeSpend();

                        System.out.println(served +" was served");
                        System.out.println("time spend " + timeInQueue );


                    }
                    break;
                case "q":
                    System.out.println("exit");
                    if (!queue.isEmpty()){
                        System.out.println("custemer are in queue " + queue);
                    }else {
                        System.out.println("queue is empty on exit");
                    }
                    scanner.close();
                    return;
                default:
                    System.out.println("command: a, r and q");

            }
        }

    }
}
