package Interface3_2.Task2;

public abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;
    protected String color;
    protected boolean engineRunning;



    public AbstractVehicle(String type, String fuel, String color){
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.engineRunning = false;

    }

    @Override
    public void start(){
        if(engineRunning){
            System.out.println(getVehicleName() + "is already runnign ");
        }
        else {
            engineRunning = true;
            System.out.println(getVehicleName() + "is starting");
        }

    }

    @Override
    public void stop(){
        if(!engineRunning){
            System.out.println(getVehicleName() + "is already Stopign ");

        }else {
            System.out.println(getVehicleName() + "is Stopign ");
        }

    }

    @Override
    public String getInfo() {
        return String.format(
                "%s info:\n  Type: %s | Fuel: %s | Color: %s | " +
                        "Engine: %s ",
                getVehicleName(), type, fuel, color,
                engineRunning ? "ON" : "OFF"

        );
    }

    public boolean isEngineRunning() { return engineRunning; }
    protected abstract String getVehicleName();
    public String getType(){ return type; }
    public String getFuel(){ return fuel; }
    public String getColor(){ return color; }

}