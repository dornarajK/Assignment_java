package Interface3_2.Task1;

public class Car implements Vehicle {
    private String type;
    private String fuel;
    private String color;

    public Car (String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start(){
        System.out.println("Car is startig");

    }

    @Override
    public void stop() {
        System.out.println("Car is Stoping");
    }

    @Override
    public String getInfo(){
        return String.format("Car info: \n " + type+", " + fuel+", " + color);
    }


}
