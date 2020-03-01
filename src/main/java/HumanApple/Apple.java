package HumanApple;

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple
{
    /**
     * Fields
     */
    private int weight;
    /**
     * Constructor for objects of class Apple
     */
    public Apple()
    {
        // To do:
    }
    public int getWeight() {
        return weight;
    }
    public void decrease() {
        weight--;
    }
    public boolean isEmpty() {
        if(weight>0) {
            return true;
        }
        return false;
    }
}
