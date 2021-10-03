public class Arithmetic {
    private int firstNumber;
    private int secondNumber;

    public Arithmetic(int firstNumberRandom, int secondNumberRandom) {
        this.firstNumber = firstNumberRandom;
        this.secondNumber = secondNumberRandom;
    }

    public int sumOfNumbers() {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int multiplicationOfNumbers() {
        int multiplication = firstNumber * secondNumber;
        return multiplication;
    }

    public int minimumOfNumbers() {
        int minimum;
        if (firstNumber > secondNumber) {
            minimum = secondNumber;
        } else  {
            minimum = firstNumber;
        }
        return minimum;
    }
    public int maximumOfNumbers() {
        int maximum;
        if (firstNumber > secondNumber) {
            maximum = firstNumber;
        } else {
            maximum = secondNumber;
        }
        return maximum;
    }
}
