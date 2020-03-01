package EBookReader;

/**
 * Write a description of class MyDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyDisplay extends Display
{
    /**
     * Constructor for objects of class MyDisplay
     */
    public MyDisplay()
    {
        // To do:
    }
    
    public void show(Page page) {
        System.out.println("--Begin Page--"+page.getIndex());
        page.show();
        System.out.println("--End Page--"+page.getIndex());
    }
    public void zoom(Page page) {
    }
}
