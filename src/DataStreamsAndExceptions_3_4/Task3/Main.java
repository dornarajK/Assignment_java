package DataStreamsAndExceptions_3_4.Task3;

import DataStreamsAndExceptions_3_4.Task3.model.Course;
import DataStreamsAndExceptions_3_4.Task3.model.Enrollment;
import DataStreamsAndExceptions_3_4.Task3.model.Student;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "enrollments.ser";

        Student student = new Student(343, "joku", 44);
        Course course = new Course("J1V2", "java", "Online");
        Enrollment enrollment = new Enrollment(student, course, "01.04.2026");


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(enrollment);
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Enrollment e = (Enrollment) in.readObject();
            System.out.println("Deserialized object:");
            System.out.println(e);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}