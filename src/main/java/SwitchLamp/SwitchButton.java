package SwitchLamp;

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
    private boolean status;
    private ElectricLamp lamp;
    /**
     * Constructor for objects of class SwitchButton
     */
    public SwitchButton()
    {
        // To do:
        status=false;
    }
    /**
     * Methods
     */
    public void connectToLamp(ElectricLamp lamp) {
        this.lamp=lamp;
    }
    public void switchOn() {
        if(lamp!=null) {
            lamp.turnOn();
        }else{
            System.out.println("Can't connect to the electric lamp");
        }
    }
    public void switchOff() {
        if(lamp!=null) {
            lamp.turnOff();
        }else{
            System.out.println("Can't connect to the electric lamp");
        }
    }
}
