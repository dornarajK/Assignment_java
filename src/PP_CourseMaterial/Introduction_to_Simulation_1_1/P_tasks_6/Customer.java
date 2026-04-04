package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_6;

/// Task 5


public class Customer {
    private static int nextId = 1;
    private final int id;
    private long startTime;
    private long endTime;
    private final long arriveTime;

    /// it will have an id one larger to the previous customer
    public Customer(){
        this.id = nextId++;
        this.arriveTime = System.nanoTime();
    }

    /// methods to handle them (getters and setters),
    ///  Getters
    public int getId(){return id; }

    public long getEndTime(){return endTime; }
    public long getArriveTime(){return arriveTime;}

    /// Setters
    public void setStartTime(long startTime){this.startTime = startTime; }
    public void setEndTime (long endTime){this.endTime = endTime; }

    public static void resetIdCounter() {
        nextId = 1;
    }

    /// method to find out the time spent (end time-start time).
    public long getTimeSpend(){
        return endTime - startTime;
    }
    public long getWaitingTime(){return startTime - arriveTime; }
    public long getResponseTime(){return endTime - arriveTime;}

    @Override
    public String toString(){
        return "Customer id:" + id + " Start: " + startTime + " End: " + endTime + " Time spent: " + getTimeSpend();
    }



}
