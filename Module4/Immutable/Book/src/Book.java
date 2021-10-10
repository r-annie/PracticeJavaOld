public class Book {
    private final String title;
    private final String author;
    private final int pagesSummary;
    private final String ISBN;

    public Book(String title, String author, int pagesSummary, String ISBN) {
        this.title = title;
        this.author = author;
        this.pagesSummary = pagesSummary;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesSummary() {
        return pagesSummary;
    }

    public String getISBN() {
        return ISBN;
    }
}
