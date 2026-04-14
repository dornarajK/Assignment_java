package PP_CourseMaterial.OrientationTasks_2.P_tasks_3;

public class Main {
    public static void main(String[] args) {
        EventList list = new EventList();

        list.add(new Event(14.0, EventType.EXIT));
        list.add(new Event(2.0, EventType.ARRIVAL));
        list.add(new Event(19.0, EventType.ARRIVAL));
        list.add(new Event(10.0, EventType.ARRIVAL));

        Event next = list.getNextEvent();
        System.out.println("next event: " + next);
        System.out.println(" Remaining events");
        list.print();
    }
}
