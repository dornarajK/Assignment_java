package Interface3_2;


public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car("Car", "Petrol", "red" );
        Vehicle MoVehicle = new Motorcycle("MoVehicle", "Petrol", "red" );
        Vehicle Bus = new Bus("Bus", "Petrol", "red" );

        // Car
        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println("\n");


        // Motorcycle
        MoVehicle.start();
        MoVehicle.stop();
        System.out.println(MoVehicle.getInfo());
        System.out.println("\n");


        // Bus
        Bus.start();
        Bus.stop();
        System.out.println(Bus.getInfo());





    }
}
