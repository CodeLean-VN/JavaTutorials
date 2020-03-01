package AnimalFlyable;

/**
 * Write a description of class Mammal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mammal extends Animal
{
    /**
     * Fields
     */
    protected boolean gender;
    /**
     * Constructor for objects of class Mammal
     */
    public Mammal()
    {
        // initialise instance variables
    }
    
    public abstract void sound();
    
    public abstract void move();
    
    public boolean isMale() {
        return gender;
    }
    
    public void setGender(boolean value) {
        gender=value;
    }
}
