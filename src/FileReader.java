import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileReader {
    public ArrayList<Book> ReadBooks(String fileName) throws IOException, NumberFormatException {
        ArrayList<Book> books = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                var items = line.split(" ");
                books.add(new Book(items[0], Integer.parseInt(items[1]), Integer.parseInt(items[2])));
            }
        }
        return books;
    }
}

