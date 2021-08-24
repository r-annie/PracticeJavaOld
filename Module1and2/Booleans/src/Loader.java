import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input milk amount (ml): ");
        int milkAmount = in.nextInt();
        System.out.print("Input powder amount (g): ");
        int powderAmount = in.nextInt();
        System.out.print("Input eggs count (items): ");
        int eggsCount = in.nextInt();
        System.out.print("Input sugar amount (g): ");
        int sugarAmount = in.nextInt();
        System.out.print("Input oil amount (ml): ");
        int oilAmount = in.nextInt();
        System.out.print("Input apple count (items): ");
        int appleCount = in.nextInt();

        boolean canCookAnything = false;
        boolean pancakesCook = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;
        boolean omeletteCook = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5;
        boolean applepieCook = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4;
        
        if (pancakesCook) {

            // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Pancakes");
            canCookAnything = true;
        }

        if (omeletteCook) {
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
            canCookAnything = true;
        }

        if (applepieCook) {
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");
            canCookAnything = true;
        }
        System.out.println(canCookAnything ? "Выберите блюдо из выше перечисленных" : "Недостаточно ингридиентов");
    }
}