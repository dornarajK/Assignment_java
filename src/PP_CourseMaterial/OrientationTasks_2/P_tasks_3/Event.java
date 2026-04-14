package PP_CourseMaterial.OrientationTasks_2.P_tasks_3;

import PP_CourseMaterial.OrientationTasks_2.P_tasks_3.EventType;

public class Event implements Comparable <Event> {
    private double time;
    private EventType type;

    public Event (double time, EventType type){
        this.time = time;
        this.type = type;
    }

    public double getTime(){
        return time;
    }
    public EventType getType(){return type;}

    public int compareTo(Event other) {
        return Double.compare(this.time,  other.time);
    }

    @Override
    public String toString(){
        return "Event + " + type + " @ t = " + time;
    }
}
