import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }




    public int checkStock(){
        return books.size();
    }

    public void addBook(Book book){
        if (capacity > books.size()) {
            this.books.add(book);
        }


    }
    public int checkCapacity(){
        return this.capacity;
    }

    public Book removeBook(Book book){
        this.books.remove(book);
        capacity += 1;
        return book;
    }


}






