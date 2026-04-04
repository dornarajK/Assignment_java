package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6;


import java.beans.IntrospectionException;

/// Task 5
public class OrientationTask1_4 {
    public static void main(String[] args) throws InterruptedException, IntrospectionException {
        Customer.resetIdCounter();
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(5, servicePoint);
        generator.generateCustomers();

        servicePoint.serve();
    }
}
