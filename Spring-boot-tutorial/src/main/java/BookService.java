import java.util.Collections;
import java.util.List;
public class BookService {
    public List<Book> getBooksinSort() {
        List<Book> books = new BookDAO().getBooks();
        Collections.sort(books, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        return books;
    }
    //compareTo is from functional interface class
    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}
