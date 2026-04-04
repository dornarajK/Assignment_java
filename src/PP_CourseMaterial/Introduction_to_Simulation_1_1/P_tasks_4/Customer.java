package PP_CourseMaterial.Introduction_to_Simulation_1_1.P_tasks_4;
/// Task 4


public class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;

    /// it will have an id one larger to the previous customer
    public Customer(){
        this.id = nextId++;
    }

    /// methods to handle them (getters and setters),
    ///  Getters
    public int getId(){return id; }
    public long getStrtTime(){return startTime; }
    public long getEndTime(){return endTime; }

    /// Setters
    public void setStrtTime (long startTime){this.startTime = startTime; }
    public void setEndTime (long endTime){this.endTime = endTime; }


    /// method to find out the time spent (end time-start time).
    public long getTimeSpend(){
        return endTime - startTime;
    }

    @Override
    public String toString(){
        return "Customer id:" + id + " Start: " + startTime + " End: " + endTime + " Time spent: " + getTimeSpend();
    }



}
