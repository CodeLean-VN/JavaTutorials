package MouseMonitor;

/**
 * Write a description of class Monitor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monitor {
    private PS2 port;
    /**
     * Constructor for objects of class Monitor
     */
    public Monitor() {
        // To do:
    }
    public void displayMouse() {
        System.out.println("x:"+port.getPS2X()+" - y:"+port.getPS2Y());
    }
    
    public void connectTo(PS2 port) {
        this.port=port;
    }
}
