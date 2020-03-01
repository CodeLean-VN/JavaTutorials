package Bicycle;

/**
 * Write a description of class Pedal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedal
{
    private Chain chain;
    private int gear;
    /**
     * Constructor for objects of class Pedal
     */
    public Pedal()
    {
        // To do:
        gear=1;
    }
    public void setUp(Chain chain) {
        this.chain=chain;
    }
    public int stamp() {
        return chain.transmit(gear);
    }
    public void setGear(int value) {
        gear=value;
    }
}
