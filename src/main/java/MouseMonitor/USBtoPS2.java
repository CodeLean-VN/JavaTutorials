package MouseMonitor;

/**
 * Write a description of class USBtoPS2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class USBtoPS2 implements USB, PS2 {
    private int x;
    private int y;
    /**
     * Constructor for objects of class USBtoPS2
     */
    public USBtoPS2() {
        // To do:
    }
    /**
     * USB methods
     */
    public void setUSBX(int value) {
        x=value;
    }
    public void setUSBY(int value) {
        y=value;
    }
    /**
     * PS2 methods
     */
    public int getPS2X() {
        return x;
    }
    public int getPS2Y() {
        return y;
    }
}
