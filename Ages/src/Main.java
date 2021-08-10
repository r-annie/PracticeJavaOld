import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите возраст Васи");
        int vasyaAge = console.nextInt();
        System.out.println("Введите возраст Кати");
        int katyaAge = console.nextInt();
        System.out.println("Введите возраст Миши");
        int mishaAge = console.nextInt();

        int min;
        int middle;
        int max;

        if (vasyaAge >= katyaAge) {
            max = vasyaAge;
            min = katyaAge;
        } else {
            max = katyaAge;
            min = vasyaAge;
        }
        if (mishaAge >= max) {
            middle = max;
            max = mishaAge;
        } else if (mishaAge <= min) {
            middle = min;
            min = mishaAge;
        } else {
            middle = mishaAge;
        }
        System.out.println(min + " " + middle + " " + max + " ");
    }
}
