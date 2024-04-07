import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AuthorDA {
    public static HashMap<String, Author> loadAuthors(String filename) throws IOException {
        HashMap<String, Author> authors = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0].trim();
            String bio = parts[1].trim();
            Author author = new Author(name, bio);
            authors.put(name, author);
        }
        reader.close();
        return authors;
    }
}
