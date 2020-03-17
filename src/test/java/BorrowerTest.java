import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    private Borrower borrower;
    private Book book1;
    private Library library;


  @Before
    public void before(){
    borrower = new Borrower();
      book1 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
      library = new Library(4);

  }

  @Test
    public void canCheckSize() {
      assertEquals(0, borrower.checkSize());

  }

    @Test
    public void borrowBook() {
        borrower.borrowBook(book1, library);
        assertEquals(1, borrower.checkSize());

    }

}



