# Calculator
is a simple console calculator hat demonstrates the **Model** layer of the MVC (Model-View-Controller) pattern.

```java
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

```

## Calculator Class Explanation

The Calculator class is a simple model layer that implements basic addition functionality. Here's how it works:

### State

- **currentValue**: A private integer that stores the running total, initialized to 0.

### Methods

- **reset()**: Sets currentValue back to 0. Use this to clear the calculator and start fresh.
- **add(int number)**: Adds a single positive integer to currentValue. Validation: Throws an IllegalArgumentException if the number is negative (only positive integers are allowed). This ensures data integrity by preventing invalid operations.
- **getValue()**: Returns the current accumulated total. Allows external code to read the calculator's current state.
- **sum(int... numbers)**: Accepts a variable number of arguments (varargs: int...). Iterates through each number using a while loop. Calls add() for each number, which automatically validates them. Allows you to add multiple numbers at once, e.g., calculator.sum(5, 10, 15).

### Design Pattern

This implements the Model layer of MVC (Model-View-Controller), meaning it handles the business logic (calculations) independently from how it's displayed or controlled—making it reusable across different UI frameworks.
