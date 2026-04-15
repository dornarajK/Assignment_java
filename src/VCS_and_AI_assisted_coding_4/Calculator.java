package VCS_and_AI_assisted_coding_4;

public class Calculator {
    private int currentValue = 0;

    public void reset() {
        currentValue = 0;
    }

    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        currentValue += number;
    }

    public int getValue() {
        return currentValue;
    }

    // This method sums the given positive integers to the calculator
    public void sum(int... numbers) {
        int i = 0;
        while (i < numbers.length) {
            add(numbers[i]);
            i++;
        }
    }
}
