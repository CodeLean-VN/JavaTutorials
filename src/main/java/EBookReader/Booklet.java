package EBookReader;

/**
 * Write a description of class Booklet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Booklet
{
    /**
     * Methods
     */
    protected String title;
    protected String author;
    protected Page[] pages;
    
    /**
     * Constructor for objects of class Booklet
     */
    public Booklet()
    {
        // To do:
    }
    
    public void paging(Page[] pages) {
        this.pages=pages;
    }
    
    public Page firstPage() {
        return pages[0];
    }
    
    public Page gotoPage(int index) {
        return pages[index];
    }
    
    public int countPage() {
        return pages.length;
    }
    
}
