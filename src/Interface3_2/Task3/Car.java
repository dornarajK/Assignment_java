package Interface3_2.Task3;

public class Car extends AbstractVehicle {
    private String type;
    private String fuel;
    private String color;

    public Car (String type, String fuel, String color){
        super(type, fuel, color);

    }

    @Override
    public String getVehicleName() {return "Car";}

    @Override
    public void start(){
        System.out.println("Car is startig");

    }

    @Override
    public void stop() {
        System.out.println("Car is Stoping");
    }


    @Override
    public void charge() {
        System.out.println("Not possible to charge.");
    }
}
