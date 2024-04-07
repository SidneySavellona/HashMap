import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class BookDA {
    public static HashMap<String, Book> loadBooks(String filename) throws IOException {
        HashMap<String, Book> books = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String isbn = parts[0].trim();
            String title = parts[1].trim();
            String authorName = parts[2].trim();
            Book book = new Book(isbn, title, authorName);
            books.put(isbn, book);
        }
        reader.close();
        return books;
    }
}
