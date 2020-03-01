package Game;

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends GameObject
{
    /**
     * Constructor for objects of class Hero
     */
    public Hero()
    {
        // To do:
    }
    public int action(GameObject obj) {
        return 1;
    }
    public void response(GameObject obj) {
        System.out.println("Wow!");
    }
}
