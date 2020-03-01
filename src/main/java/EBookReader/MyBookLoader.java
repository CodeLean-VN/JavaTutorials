package EBookReader;

/**
 * Write a description of class MyBookLoader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyBookLoader extends BookLoader
{
    /**
     * Constructor for objects of class MyBookLoader
     */
    public MyBookLoader()
    {
        // To do:
    }
    public Page[] paging(String path) {
        return demoBook();
    }
    public Page[] demoBook() {
        Page[] pages=new Page[3];
        Page p;
        Line[] lines;
        lines=new Line[] {
                                new Line("Hello Book"),
                                new Line("This is my content")
                                };
        
        p=new MyPage(lines,1);
        pages[0]=p;
        
        lines=new Line[] {
                                new Line("Table Content"),
                                new Line("This is my table content"),
                                new Line("This is my table content")
                                };
        
        p=new MyPage(lines,2);
        pages[1]=p;
        
        lines=new Line[] {
                                new Line("Story"),
                                new Line("This is my Story"),
                                new Line("This is my Story"),
                                };
        
        p=new MyPage(lines,3);
        pages[2]=p;
        return pages;
    }
}