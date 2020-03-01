package DigitalClock.equipments;
/**
 * Write a description of class DigitalClock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitalClock
{
    /**
     * Fields
     */
    private int second=0;
    private int minute=0;
    private int hour=0;
    /**
     * Constructor for objects of class DigitalClock
     */
    public DigitalClock()
    {
        // To do:
    }
    public DigitalClock(int h,int m,int s)
    {
        // To do:
        second=s;
        minute=m;
        hour=h;
    }
    private void secondTick() {
        minuteTick();
    }
    private void minuteTick() {
        hourTick();
    }
    private void hourTick() {
    }
    public void tick() {
        secondTick();
    }
    public String toString() {
        return hour+":"+minute+":"+second;
    }
}
