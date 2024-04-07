import java.io.IOException;
import java.util.HashMap;

public class BookReport {
    public static void main(String[] args) {
        try {
            HashMap<String, Book> books = BookDA.loadBooks("Book.csv");
            HashMap<String, Author> authors = AuthorDA.loadAuthors("Author.csv");

            for (Book book : books.values()) {
                Author author = authors.get(book.getAuthorName());
                if (author != null) {
                    System.out.println(book.getIsbn() + " " + book.getTitle());
                    System.out.println("\t" + author.getName() + " - " + author.getBio());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
