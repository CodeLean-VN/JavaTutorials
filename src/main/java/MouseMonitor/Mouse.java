package MouseMonitor;

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse {
    /**
     * Fields
     */
    private int x;
    private int y;
    private USB port;
    /**
     * Constructor for objects of class Mouse
     */
    public Mouse() {
        // To do:
        x=0;
        y=0;
    }
    /**
     * Methods
     */
    public void move(int x,int y) {
        this.x=x;
        this.y=y;
        port.setUSBX(x);
        port.setUSBY(y);
    }
    
    public void connectTo(USB port) {
        this.port=port;
    }
    
}
