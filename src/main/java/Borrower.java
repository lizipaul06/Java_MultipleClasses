import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> collection;
    private Book book;
    private Library library;

    public Borrower(){
    this.collection = new ArrayList<Book>();
 }

    public int checkSize(){
        return collection.size();
    }

    public void borrowBook(Book book, Library library){
        library.removeBook(book);
        collection.add(book);
    }


}


