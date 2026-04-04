package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_3;
/// Task 3
public class OrientationTask1_4 {
    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer();

        ///  time simulate
        customer.setStrtTime(System.currentTimeMillis());
        Thread.sleep(200);
        customer.setEndTime(System.currentTimeMillis());

        customer2.setStrtTime(System.currentTimeMillis());
        Thread.sleep(200);
        customer2.setEndTime(System.currentTimeMillis());

        customer3.setStrtTime(System.currentTimeMillis());
        Thread.sleep(200);
        customer3.setEndTime(System.currentTimeMillis());

        /// print
        System.out.println(customer);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println();
        System.out.println("id: ");
        System.out.println("customer id: " + customer.getId());
        System.out.println("customer2 id: " + customer2.getId());
        System.out.println("customer3 id: " + customer3.getId());



    }
}
