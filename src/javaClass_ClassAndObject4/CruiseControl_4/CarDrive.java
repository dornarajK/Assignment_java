package javaClass_ClassAndObject4.CruiseControl_4;

public class CarDrive {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Corolla", 100, 12);
        myCar.fillTank();

        // Accelerate normally
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        // Set cruise control to 50 km/h
        myCar.setCruiseSpeed(50);

        // Try to turn on cruise control
        if (myCar.turnOnCruise()) {
            System.out.println("Cruise control activated! Target speed: " + myCar.getCruiseSpeed() + " km/h");

            // Simulate car adjusting speed to reach target


            while (myCar.getSpeed() > 0) {
                myCar.decelerate(15);
                System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
            }


            System.out.println("Cruise speed reached!");
        } else {
            System.out.println("Cruise control could not be activated!");
        }

        // Turn off cruise control
        myCar.turnOffCruise();

        // Test additional scenarios
        System.out.println("\n--- Testing invalid cruise speed ---");
        myCar.setCruiseSpeed(20); // Below minimum
        if (myCar.turnOnCruise()) {
            System.out.println("Cruise control activated!");
        } else {
            System.out.println("Cruise control could not be activated! Speed " +
                    myCar.getCruiseSpeed() + " km/h is invalid");
        }

        System.out.println("\n--- Testing high cruise speed ---");
        myCar.setCruiseSpeed(200); // Above maximum
        if (myCar.turnOnCruise()) {
            System.out.println("Cruise control activated!");
        } else {
            System.out.println("Cruise control could not be activated! Speed " +
                    myCar.getCruiseSpeed() + " km/h is invalid");
        }
    }
}