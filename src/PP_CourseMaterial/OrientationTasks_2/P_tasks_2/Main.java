package PP_CourseMaterial.OrientationTasks_2.P_tasks_2;

public class Main {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.add(new Event(14.0));
        list.add(new Event(2.0));
        list.add(new Event(19.0));
        list.add(new Event(10.0));

        Event next = list.getNextEvent();
        System.out.println("next event: " + next);
        System.out.println(" Remaining events");
        list.print();
    }
}
