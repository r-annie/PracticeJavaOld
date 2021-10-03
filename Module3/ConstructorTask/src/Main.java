public class Main {
    public static void main(String[] args) {
        Arithmetic firstCoupleOfNumbers = new Arithmetic(23,44);
        System.out.println("Сумма чисел: " + firstCoupleOfNumbers.sumOfNumbers());
        System.out.println("Произведение чисел: " + firstCoupleOfNumbers.multiplicationOfNumbers());
        System.out.println("Минимальное число: " + firstCoupleOfNumbers.minimumOfNumbers());
        System.out.println("Максимальное число: " + firstCoupleOfNumbers.maximumOfNumbers());
    }
}
