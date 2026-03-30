package Inheritance3_1;

public class Bus extends Car {
    private static final String typeName = "";
    private int passengerCount;
    private final int maxCapacity;


    public Bus (int passengerCount, int maxCapcity){
        super(typeName);
        this.passengerCount = passengerCount;
        this.maxCapacity = maxCapcity;
    }
    public int passengerEnter(int count){

        int available = maxCapacity - passengerCount;
        int boardign = Math.min(count, available);
        passengerCount += boardign;
        return boardign = count;
    }

    public int passengerExit(int count) {
        if (count <= 0) return 0;
        int exiting = Math.min(count, passengerCount);
        passengerCount -= exiting;
        return exiting;  // actual number who got off
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            // Heavier load = slower acceleration and more fuel use
            double loadFactor = 1.0 + (double) passengerCount / maxCapacity;
            speed += 10.0 / loadFactor;
            gasolineLevel -= loadFactor;
            if (gasolineLevel < 0) gasolineLevel = 0;
        } else {
            speed = 0;
        }
    }
    public int getPassengerCount() { return passengerCount; }
    public int getMaxCapacity()    { return maxCapacity; }
    public boolean isFull()        { return passengerCount >= maxCapacity; }
    public boolean isEmpty()       { return passengerCount == 0; }

}
