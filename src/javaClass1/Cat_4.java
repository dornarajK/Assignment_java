package javaClass1;

public class Cat_4 {
    private String name;

    public Cat_4(String name) {
        this.name = name;
    }


    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        // Create an instance of the Cat class with a name
        Cat_4 cat = new Cat_4("Whiskers" );

        Cat_4 rex = new Cat_4("Rex");


        // Call the meow method on the cat instance
        cat.meow();
        cat.meow();
        rex.meow();
        cat.meow();

    }
}
