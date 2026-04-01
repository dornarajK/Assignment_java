package Interface3_2.Task3;

public class ElectricMotorcycle extends AbstractVehicle{
    public ElectricMotorcycle(String type, String fuel, String color){
        super(type, fuel, color);
    }

    @Override
    protected String getVehicleName() {
        return "ElectricMotorcycle";
    }
    @Override
    public void charge(){
        System.out.println("ElectricMotorcycle is Charging");
    }




}
