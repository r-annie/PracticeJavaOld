public class Main {

    public static void main(String[] args) {
        Basket basketPetya = new Basket();
        basketPetya.add("Milk", 40);
        basketPetya.add("Chocolate", 100);
        basketPetya.print("Корзина Пети:");

        Basket basketLily = new Basket();
        basketLily.add("Ice cream", 20, 3);
        basketLily.add("Crisps", 75,2,0.05);
        basketLily.add("Cola", 50,3,0.5);
        basketLily.print("Корзина Лили:");
        System.out.println("Общая стоимость: " + basketLily.getTotalPrice() + " руб.");
        System.out.println("Общий вес: " + basketLily.getTotalWeight() + " кг");


        Basket basketMiku = new Basket();
        basketMiku.print("Корзина Мику:");
    }
}
