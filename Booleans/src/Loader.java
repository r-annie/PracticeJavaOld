
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1200; // ml
        int powderAmount = 1200; // g
        int eggsCount = 1200; // items
        int sugarAmount = 1200; // g
        int oilAmount = 1200; // ml
        int appleCount = 0;
        boolean canCookAnything = false;
        boolean pancakesCook = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;
        boolean omeletteCook = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5;
        boolean applepieCook = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4;

        if (pancakesCook == true) {

            // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Pancakes");
            canCookAnything = true;
        }

        if (omeletteCook == true) {
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
            canCookAnything = true;
        }

        if (applepieCook == true) {
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Apple pie");
            canCookAnything = true;
        }
        System.out.println(canCookAnything ? "Выберите блюдо из выше перечисленных" : "Недостаточно ингридиентов");
    }
}