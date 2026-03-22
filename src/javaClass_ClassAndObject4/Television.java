package javaClass_ClassAndObject4;

public class Television {

    private int channel;
    private boolean on;

    public Television(){
        channel = 1;
        on = false;
    }
    public void pressOnOff(){
        on = !on;
    }
    public boolean isOn(){
        return on;
    }

    public void setChannel(int newChannel){
        if (newChannel > 10) {
            channel = 1;
        }else {
            channel = newChannel;
        }
    }

    public int getChannel(){
        return channel;
    }

}
