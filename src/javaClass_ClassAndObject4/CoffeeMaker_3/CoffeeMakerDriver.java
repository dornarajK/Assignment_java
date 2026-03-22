package javaClass_ClassAndObject4.CoffeeMaker_3;

public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker myCoffe = new CoffeeMaker();
        myCoffe.setCoffeeType("normal");


        if (!myCoffe.isOn()){
            myCoffe.pressOnOff();
            System.out.println("Coffee maker is on");

        }
        myCoffe.setCoffeeType("normal");
        myCoffe.setAmount(50);

        System.out.println("Coffee type is " + myCoffe.getCoffeeType());
        System.out.println("Coffee amount is " + myCoffe.getAmount() + " ml");

        myCoffe.pressOnOff();
        System.out.println("Coffee maker is off");


    }
}
