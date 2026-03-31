package Interface3_2.Task2;

public class Motorcycle extends AbstractVehicle {
    private String type;
    private String fuel;
    private String color;

    public Motorcycle(String type, String fuel, String color){
        super(type, fuel, color);

    }

    @Override
    public String getVehicleName(){
        return "Motorcycle";
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is startig");
    }

    @Override
    public void stop (){
        System.out.println("Motorcycle is Stoping");

    }


}
