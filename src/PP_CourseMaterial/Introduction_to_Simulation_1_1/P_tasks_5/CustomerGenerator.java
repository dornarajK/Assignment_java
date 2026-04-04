package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_5;

import PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6.Customer;
import PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6.ServicePoint;

import javax.naming.directory.SearchResult;

public class CustomerGenerator {
    private final int numberOfCustamer;
    private final ServicePoint servicePoint;

    public CustomerGenerator(int numberOfCustomers, ServicePoint servicePoint) {
        this.numberOfCustamer = numberOfCustomers;
        this.servicePoint = servicePoint;
    }

    public void generateCustomers() {
        System.out.println("=== Generating " + numberOfCustamer + " customers ===");
        for (int i = 0; i < numberOfCustamer; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}
