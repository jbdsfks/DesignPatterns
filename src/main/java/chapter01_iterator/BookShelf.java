package chapter01_iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
//    private Book[] books;
    private List<Book> books;
//    private int last = 0;
    public BookShelf(int size){
//        this.books = new Book[size];
        this.books = new ArrayList<Book>(size);
    }
    public Book getBookAt(int index){
//        return books[index];
        return books.get(index);
    }
    public void appendBook(Book book){
//        this.books[last] = book;
        books.add(book);
//        last++;
    }
    public int getLength(){
//        return last;
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
