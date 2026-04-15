package VCS_and_AI_assisted_coding_4;

public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum(10, 25, 5);
        System.out.println("After adding 10, 25, 5  → " + calc.getValue());
    }
}
