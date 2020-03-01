package ArrayLedBoard;

/**
 * Write a description of class Led here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Led
{
    /**
     * Fields
     */
    private boolean status;
    /**
     * Constructor for objects of class Led
     */
    public Led()
    {
        // To do:
        status=false;
    }
    public void on() {
        status=true;
    }
    public void off() {
        status=false;
    }
    public void display() {
        if(status) {
            System.out.print("*");
        }else{
            System.out.print("o");
        }
    }
}
