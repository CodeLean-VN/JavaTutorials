package Game;

/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client
{
    /**
     * Constructor for objects of class Client
     */
    public Client()
    {
        // To do:
    }
    public void play() {
        GameObject hero=new Hero();
        GameObject enemy=new Enemy();
        GameObject item=new Item();
        
        hero.moveTo(2,4);
        hero.collisionRequest(enemy);
    }
}
