public class Main {
    public static void main(String[] args) {
        Book jsamn = new Book("Jonathan Strange and Mr. Norrell","S.Clarke",
                1006,"9780747570554");
        System.out.println(jsamn.getAuthor());
        System.out.println(jsamn.getTitle());
        System.out.println(jsamn.getPagesSummary());
        System.out.println(jsamn.getISBN());
    }
}
