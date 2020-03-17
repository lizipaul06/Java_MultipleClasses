import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("50 Shades", "Someone", "Romance");
        book3 = new Book("new book", "My Guy", "Adventure");
    }

    @Test
    public void checkStock(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(5, library.checkStock());
    }

    @Test
    public void CanAddBook(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);
        assertEquals(5, library.checkStock());
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(5, library.checkCapacity());
    }

    @Test
    public void wontAtCapacity(){
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book2);
        assertEquals(5, library.checkStock());
        library.addBook(book2);
        assertEquals(5, library.checkStock());
    }
}
