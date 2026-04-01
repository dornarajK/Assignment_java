package Interface3_2.Task3;

public class ElectricCar extends AbstractVehicle{
    public ElectricCar(String type, String fuel, String color) {
        super(type, fuel, color);
    }

    @Override
    protected String getVehicleName() {
        return "ElectricCar";
    }


    @Override
    public void start(){
        System.out.println("ElectricCar is startig");

    }

    @Override
    public void stop() {
        System.out.println("ElectricCar is Stoping");
    }



    @Override
    public void charge() {
        System.out.println("ElectricCar is Charging");
    }
}
