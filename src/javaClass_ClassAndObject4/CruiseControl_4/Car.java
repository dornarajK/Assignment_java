package javaClass_ClassAndObject4.CruiseControl_4;

public class Car {
    private double speed;
    private double gasolineLevel;
    private final String typeName;

    // Cruise control fields
    private boolean cruiseOn = false;
    private double cruiseSpeed;
    private final double MIN_CRUISE_SPEED = 30;
    private final double MAX_CRUISE_SPEED = 150;

    public Car(String typeName, double gasolineLevel, double speed){
        this.typeName = typeName;
        this.gasolineLevel = gasolineLevel;
        this.speed = speed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    double getSpeed() {
        return speed;
    }

    String getTypeName() {
        return typeName;
    }

    void fillTank() {
        gasolineLevel = 100;
    }

    double getGasolineLevel() {
        return gasolineLevel;
    }

    // --- Cruise control methods ---
    public void setCruiseSpeed(double speed) {
        this.cruiseSpeed = speed;
    }

    public double getCruiseSpeed() {
        return cruiseSpeed;
    }

    public boolean turnOnCruise() {

        if (cruiseSpeed >= MIN_CRUISE_SPEED && cruiseSpeed <= MAX_CRUISE_SPEED) {

            if (gasolineLevel > 0) {
                cruiseOn = true;
                return true;
            }
        }
        cruiseOn = false;
        return false;
    }

    public void turnOffCruise() {
        cruiseOn = false;
    }

    public void adjustSpeedForCruise() {
        if (!cruiseOn) return;

        if (speed < cruiseSpeed) {
            accelerate();
        } else if (speed > cruiseSpeed) {
            decelerate(10);
        }

        // Check if cruise control needs to be disabled
        if (gasolineLevel <= 0) {
            cruiseOn = false;
            System.out.println("Cruise control turned off due to no gasoline!");
        }
    }
}