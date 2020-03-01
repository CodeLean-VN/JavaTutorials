package Switchable;

/**
 * Write a description of class Radio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Radio implements Switchable
{
    /**
     * Fields
     */
    private String status;
    /**
     * Constructor for objects of class Radio
     */
    public Radio()
    {
        // To do:
        status="............";
    }
    
    public void switchOn() {
        status="^&%&^%^$^%@!)(^#!";
        System.out.println(status);
    }
    public void switchOff() {
        status="............";
        System.out.println(status);
    }
}
