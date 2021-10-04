import java.util.Objects;

public class Printer {
    private String queue = "";
    private int pendingPagesCount = 0;
    private int overallPagesCount = 0;

    public void append(String text, String title) { append(text, title, 0); }

    public void append(String text) { append(text, "none", 0); }

    public void append(String text, String title, int numberOfPages) {

        queue = queue + "\n" + "- Текст документа:" + "\n" + text + "\n";
        if (!Objects.equals(title, "none")) {
            queue = queue + "- Имя документа:" + "\n" + title + "\n";
        }
        if (numberOfPages != 0) {
            queue = queue + "- Количество страниц: " + numberOfPages + "\n";
            pendingPagesCount = pendingPagesCount + numberOfPages;
            }
        System.out.println("\n" +  "Печатаю..." + "\n");
        }

    public void clear() {
        queue = "";
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.print("В очереди на печать нет документов");
        } else {
            System.out.print("Список документов на печать:");
            System.out.println(queue);
            overallPagesCount = overallPagesCount + pendingPagesCount;
            pendingPagesCount = 0;
            queue = "";
        }
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public int getOverallPagesCount() {
        return overallPagesCount;
    }
}
