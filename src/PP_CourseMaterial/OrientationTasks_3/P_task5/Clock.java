package PP_CourseMaterial.OrientationTasks_3.P_task5;

public class Clock {
    private static Clock instance;
    private double time;

    private Clock() {
        time = 0.0;
    }

    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void advance(double delta) {
        this.time += delta;
    }
}
