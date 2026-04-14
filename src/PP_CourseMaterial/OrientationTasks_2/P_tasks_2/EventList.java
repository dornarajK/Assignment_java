package PP_CourseMaterial.OrientationTasks_2.P_tasks_2;

import java.util.PriorityQueue;

public class EventList  {
    private PriorityQueue <Event> queue = new PriorityQueue<>();


    public void add(Event e){
        queue.add(e);
    }
    public Event getNextEvent(){
        return queue.poll();
    }

    public void print(){
        PriorityQueue <Event> copy = new PriorityQueue<>(queue);
        while (!copy.isEmpty()){
            System.out.println(copy.poll());
        }
    }
}
