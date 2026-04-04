package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_5;


import PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6.ServicePoint;

import java.beans.IntrospectionException;
import java.util.LinkedList;
import java.util.Scanner;

/// Task 6
public class OrientationTask1_4 {
    public static void main(String[] args) throws InterruptedException, IntrospectionException {
        ServicePoint servicePoint = new ServicePoint();
        CustomerGenerator generator = new CustomerGenerator(5, servicePoint);
        generator.generateCustomers();

        servicePoint.serve();
    }
}
