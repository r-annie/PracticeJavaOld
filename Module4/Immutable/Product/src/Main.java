public class Main {

    public static void main(String[] args) {
        Product apple = new Product("Apple","111222333444");
        System.out.println(apple.getName());
        System.out.println(apple.getBarCode());
        apple.setPrice(25);
        System.out.println(apple.getPrice());
    }
}
