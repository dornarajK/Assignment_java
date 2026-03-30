package Inheritance3_1;


public class Car {

    protected double speed;
    protected double gasolineLevel;
    private String typeName;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel -= 1;   // normal fuel consumption
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else {
            speed = 0;
        }
    }

    public double getSpeed()         { return speed; }
    public String getTypeName()      { return typeName; }
    public void fillTank()           { gasolineLevel = 100; }
    public double getGasolineLevel() { return gasolineLevel; }
}
