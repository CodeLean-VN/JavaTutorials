package SwitchLamp;

/**
 * Write a description of class ElectricLamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricLamp
{
    /**
     * Fields
     */
    private boolean status;
    /**
     * Constructor for objects of class ElectricLamp
     */
    public ElectricLamp()
    {
        // To do:
        status=false;
    }
    /**
     * Methods
     */
    public void turnOn() {
        status=true;
        System.out.println("Light!");
    }
    public void turnOff() {
        status=false;
        System.out.println("Dark!");
    }
}
