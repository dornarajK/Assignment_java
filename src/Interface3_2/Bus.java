package Interface3_2;

public class Bus implements Vehicle{
    private String type;
    private String fuel;
    private String color;

    public Bus(String type, String fuel, String color ){
        this.type = type;
        this.fuel = fuel;
        this.color = color;

    }

    @Override
    public void start(){
        System.out.println("bus is startig");

    }

    @Override
    public void stop() {
        System.out.println("bus is Stoping");
    }

    @Override
    public String getInfo(){
        return String.format("bus info: \n" + type +", " + fuel +", "+ color);
    }




}
