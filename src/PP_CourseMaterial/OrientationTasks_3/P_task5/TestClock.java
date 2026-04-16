package PP_CourseMaterial.OrientationTasks_3.P_task5;

public class TestClock {
    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        Clock clock2 = Clock.getInstance();

        System.out.println("Initial time from clock1: " + clock1.getTime());
        System.out.println("Initial time from clock2: " + clock2.getTime());

        clock1.setTime(10.5);
        System.out.println("\nAfter setting time to 10.5 using clock1:");
        System.out.println("Time from clock1: " + clock1.getTime());
        System.out.println("Time from clock2: " + clock2.getTime());

        clock2.advance(5.0);
        System.out.println("\nAfter advancing time by 5.0 using clock2:");
        System.out.println("Time from clock1: " + clock1.getTime());
        System.out.println("Time from clock2: " + clock2.getTime());

        if (clock1 == clock2) {
            System.out.println("Singleton works: both references are same object");
        } else {
            System.out.println("Error: different instances");
        }
    }
}
