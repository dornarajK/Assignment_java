package Interface3_2.Task2;

public class Bus extends AbstractVehicle{
    private String type;
    private String fuel;
    private String color;

    public Bus(String type, String fuel, String color ){
        super(type, fuel, color);

    }
    @Override
    public String getVehicleName(){
        return "Bus";
    }

    @Override
    public void start(){
        System.out.println("bus is startig");

    }

    @Override
    public void stop() {
        System.out.println("bus is Stoping");
    }




}
