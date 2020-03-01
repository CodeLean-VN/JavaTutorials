package Switchable;

/**
 * Write a description of class SwitchButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwitchButton
{
    /**
     * Fields
     */
    private Switchable switchObj;
    /**
     * Constructor for objects of class SwitchButton
     */
    public SwitchButton()
    {
        // To do:
    }
    
    public void connectTo(Switchable switchObj) {
        this.switchObj=switchObj;
    }
    
    public void switchOn() {
        switchObj.switchOn();
    }
    
    public void switchOff() {
        switchObj.switchOff();
    }
}
