package Game;

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends GameObject
{
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy()
    {
        // To do:
    }
    
    public int action(GameObject obj) {
        return 1;
    }
    public void response(GameObject obj) {
        System.out.println("Ah!");
    }
}
