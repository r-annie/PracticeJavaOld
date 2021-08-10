import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите возраст Васи");
        int max = console.nextInt();
        System.out.println("Введите возраст Кати");
        int middle = console.nextInt();
        System.out.println("Введите возраст Миши");
        int min = console.nextInt();

        if (max <= min) {
            int temp = min;
            max = min;
            min = temp;
        }
        if (middle >= max) {
            int temp = middle;
            middle = max;
            max = middle;
        } else if (middle <= min) {
            int temp = middle;
            middle = min;
            min = middle;
        }
        System.out.println(min + " " + middle + " " + max + " ");
    }
}