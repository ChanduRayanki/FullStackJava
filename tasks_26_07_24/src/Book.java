import java.lang.*;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int tenure; // tenure in days

    public Book(String title, String author, String isbn, int tenure) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.tenure = tenure;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Tenure: " + tenure + " days]";
    }
}
