package Interface3_2.Task3;


    public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle car = new Car("Car", "Petrol", "red" );
        Vehicle MoVehicle = new Motorcycle("MoVehicle", "Petrol", "red" );
        Vehicle Bus = new Bus("Bus", "Petrol", "red" );
        ElectricVehicle ElectricCar = new ElectricCar("ElectricCar", "Electric", "red" );
        ElectricVehicle ElectricMotorcycle = new ElectricMotorcycle("ElectricMotorcycle", "Electric", "blue");

        ElectricCar.charge();
        ElectricCar.start();
        ElectricCar.stop();
        System.out.println();
        ElectricMotorcycle.charge();

        System.out.println();



        Vehicle[] fleet = {car, MoVehicle, Bus};

        for (Vehicle v: fleet){
            v.charge();
            v.start();
            v.stop();
            System.out.println(v.getInfo());
            System.out.println();
        }




    }
}
