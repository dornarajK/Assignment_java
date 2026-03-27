package Interface3_2;

public class Motorcycle implements Vehicle{
    private String type;
    private String fuel;
    private String color;

    public Motorcycle(String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
        this.color = color;
    }

    @Override
    public void start(){
        System.out.println("Motorcycle is startig");
    }

    @Override
    public void stop (){
        System.out.println("Motorcycle is Stoping");

    }

    @Override
    public String getInfo(){
        return String.format("Motorcycle info: " + type + fuel + color);
    }

}
