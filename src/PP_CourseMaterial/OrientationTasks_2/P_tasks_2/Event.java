package PP_CourseMaterial.OrientationTasks_2.P_tasks_2;

public class Event implements Comparable <Event> {
    private double time;

    public Event (double time){
        this.time = time;
    }

    public double getTime(){
        return time;
    }

    public int compareTo(Event other) {
        return Double.compare(this.time,  other.time);
    }

    @Override
    public String toString(){
        return "Event @ t = " + time;
    }
}
