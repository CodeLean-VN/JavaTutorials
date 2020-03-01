package Bicycle;

/**
 * Write a description of class Chain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chain
{
    private Wheel wheel;
    /**
     * Constructor for objects of class Chain
     */
    public Chain()
    {
        // To do:
    }
    
    public void setUp(Wheel w) {
        wheel=w;
    }
    public int transmit(int gear) {
        return wheel.roll(gear);
    }
}
