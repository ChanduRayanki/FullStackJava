import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the library.");
    }

    public void removeExpiredBooks() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTenure() <= 0) {
                System.out.println(book.getTitle() + " has been removed from the library due to expired tenure.");
                iterator.remove();
            }
        }
    }

    public void updateBookTenure(String isbn, int newTenure) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                book.setTenure(newTenure);
                System.out.println("Updated tenure for " + book.getTitle() + " to " + newTenure + " days.");
            }
        }
    }

    public void listBooks() {
        System.out.println("Books currently in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
