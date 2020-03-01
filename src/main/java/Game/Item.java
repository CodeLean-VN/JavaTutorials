package Game;

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends GameObject
{
    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // To do:
    }
    public int action(GameObject obj) {
        return 1;
    }
    public void response(GameObject obj) {
        System.out.println("!!!");
    }
}
