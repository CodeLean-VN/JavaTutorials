package Switchable;

/**
 * Write a description of class ElectricLamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElectricLamp implements Switchable
{
    /**
     * Fields
     */
    private String status;
    /**
     * Constructor for objects of class ElectricLamp
     */
    public ElectricLamp()
    {
        // To do:
        status="Dark!";
    }
    public void switchOn() {
        status="Light!";
        System.out.println(status);
    }
    public void switchOff() {
        status="Dark!";
        System.out.println(status);
    }
}
