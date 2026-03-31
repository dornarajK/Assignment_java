package Interface3_2.Task2;


public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car("Car", "Petrol", "red" );
        Vehicle MoVehicle = new Motorcycle("MoVehicle", "Petrol", "red" );
        Vehicle Bus = new Bus("Bus", "Petrol", "red" );

        Vehicle[] fleet = {car, MoVehicle, Bus};

        for (Vehicle v: fleet){
            v.start();
            v.stop();
            System.out.println(v.getInfo());
        }




    }
}
