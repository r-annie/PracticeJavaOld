public class Main {
    public static void main(String[] args) {
        Printer book = new Printer();
        book.append("The book about war and love", "War and Piece", 1200);
        book.append("This is my voice 5 days in Java", "Full collection of programmers memes");
        book.append("Office stuff");

        System.out.println("Количество страниц в очереди на печать:" + book.getPendingPagesCount());
        book.print();
        System.out.println("Количество страниц в очереди на печать:" + book.getPendingPagesCount());
        book.append("Fluffy poem", "Hokku", 130);
        book.print();
        System.out.println("Количество страниц всего (распечатанных):" + book.getOverallPagesCount());
    }
}
