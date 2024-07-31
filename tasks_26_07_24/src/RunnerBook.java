import java.lang.*;
public class RunnerBook {
    public static void main(String[] args) {
        Library library = new Library();

        // Add new books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567890", 30));
        library.addBook(new Book("1984", "George Orwell", "1234567891", 15));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "1234567892", 0)); // Expired book

        // List all books
        library.listBooks();

        // Remove expired books
        library.removeExpiredBooks();

        // Update the tenure of a book
        library.updateBookTenure("1234567891", 20);

        // List all books after update
        library.listBooks();
    }
}
