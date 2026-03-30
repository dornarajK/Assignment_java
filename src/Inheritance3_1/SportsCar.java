package Inheritance3_1;

public class SportsCar extends Car {

    private static final double ACCELERATION_BOOST = 20;
    private static final double FUEL_CONSUMPTION    = 2.5;
    private static final double BRAKE_MULTIPLIER    = 1.5;

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += ACCELERATION_BOOST;
            gasolineLevel -= FUEL_CONSUMPTION;
            if (gasolineLevel < 0) gasolineLevel = 0;
        } else {
            speed = 0;
        }
    }

    @Override
    public void decelerate(int amount) {

        super.decelerate((int)(amount * BRAKE_MULTIPLIER));
    }
}