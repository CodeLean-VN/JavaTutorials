package EBookReader;

/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line
{
    private String string;
    /**
     * Constructor for objects of class Line
     */
    public Line(String line)
    {
        // To do:
        this.string=line;
    }
    public String getString() {
        return string;
    }
    public void setString(String value) {
        this.string=string;
    }
}
