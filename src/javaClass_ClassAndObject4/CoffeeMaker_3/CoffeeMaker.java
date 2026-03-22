package javaClass_ClassAndObject4.CoffeeMaker_3;

import java.lang.reflect.Type;

public class CoffeeMaker {
    private String coffeeType;
    private  int amount;
    private boolean on;

    public void pressOnOff(){
        on = !on;
    }

    public boolean isOn(){
        return on;
    }

    public void setCoffeeType(String type){
        if(on){
            coffeeType = type;
        }
    }

    public String getCoffeeType(){
        return coffeeType;
    }

    public void setAmount(int amount){
        if (on){
            this.amount =  amount;
        }
    }

    public int getAmount(){
        return amount;
    }

}
