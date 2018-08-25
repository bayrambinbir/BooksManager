package bookmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import books.AudioBook;
import books.Book;
import books.PaperbackBook;
import people.Author;

public class BooksController {

  public static void loadBooks(String fileName, List<Book> storageList) {
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
      String line = "";
      line = br.readLine();
      
      while ((line = br.readLine()) != null) {
        // type  title  genre  author  price  rating  length  copiesAvailible  pages
        // 0  1    2    3    4    5    6    7        8
        String cell[] = line.split(",");
        Book thisBook = null;
        switch (cell[0]) {
        case "PaperbackBook":
          thisBook = new PaperbackBook(cell[1], cell[2], new Author(cell[3]), 
              Double.parseDouble(cell[4]), Integer.parseInt(cell[7]), Integer.parseInt(cell[8]));
          break;
        case "AudioBook":
          thisBook = new AudioBook(cell[1], cell[2], new Author(cell[3]), 
              Double.parseDouble(cell[4]), Integer.parseInt(cell[5]), Integer.parseInt(cell[6]));
          break;
        }
        storageList.add(thisBook);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
  



