package EBookReader;

/**
 * Write a description of class BookLoader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class BookLoader
{
    /**
     * Constructor for objects of class BookLoader
     */
    public BookLoader()
    {
        // To do:
    }
    protected Booklet loadBook(String path) {
        Booklet book=new Booklet();
        book.paging(this.paging(path));
        return book;
    }
    protected abstract Page[] paging(String path);
}
