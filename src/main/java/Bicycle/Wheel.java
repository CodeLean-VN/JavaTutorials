package Bicycle;

/**
 * Write a description of class Wheel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wheel
{
    private int gear;
    /**
     * Constructor for objects of class Wheel
     */
    public Wheel()
    {
        // To do:
        gear=4;
    }
    public int roll(int pedalGear) {
        return this.gear*pedalGear;
    }
    public void setGear(int value) {
        gear=value;
    }
}
