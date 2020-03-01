package EBookReader;

/**
 * Write a description of class EBookReader here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class EBookReader
{
    private Booklet book;
    private Display display;
    private BookLoader loader;
    private int currentPage;
    /**
     * Constructor for objects of class EBookReader
     */
    public EBookReader(BookLoader loader)
    {
        // To do:
        this.loader=loader;
    }
    public void initDisplay(Display display) {
        this.display=display;
    }
    public void openBook(String path) {
        book=loader.loadBook(path);
    }
    public void readFirstPage() {
        display.show(book.firstPage());
    }
    public void readNextPage() {
        if(currentPage<book.countPage()) {
            currentPage++;
            display.show(book.gotoPage(currentPage));
        }
    }
    public void readPreviousPage() {
        if(currentPage>0) {
            currentPage--;
            display.show(book.gotoPage(currentPage));
        }
    }
}