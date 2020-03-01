package EBookReader;

/**
 * Write a description of class Page here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Page
{
    protected int index;
    /**
     * Constructor for objects of class Page
     */
    public Page()
    {
        // To do:
    }
    public abstract void show();
    
    public int getIndex() {
        return index;
    }
    public void setIndex(int value) {
        index=value;
    }
}
