package Bicycle;

/**
 * Write a description of class Bycicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bicycle {
    /**
     * Fields
     */
    private Wheel w1;
    private Wheel w2;
    private Chain chain;
    private Pedal pedal;
    private int position;
    /**
     * Constructor for objects of class Bycicle
     */
    public Bicycle()
    {
        // To do:
        w1=new Wheel();
        w2=new Wheel();
        chain=new Chain();
        pedal=new Pedal();
        pedal.setUp(chain);
        chain.setUp(w2);
    }
    /**
     * Methods
     */
    public int move() {
        position+=pedal.stamp();
        return position;
    }
    
    public void changePedalGear(int value) {
        pedal.setGear(value);
    }
    
    public void changWheelGear(int value) {
        w2.setGear(value);
    }
    
}
