package Switchable;

/**
 * Write a description of class Fan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricFan implements Switchable
{
    /**
     * Fields
     */
    private String status;
    /**
     * Constructor for objects of class Fan
     */
    public ElectricFan()
    {
        // To do:
        status="Y";
    }
    
    
    public void switchOn() {
        status="@";
        System.out.println(status);
    }
    public void switchOff() {
        status="Y";
        System.out.println(status);
    }
}
