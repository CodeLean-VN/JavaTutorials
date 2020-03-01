package Game;

/**
 * Write a description of class GameObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class GameObject
{
    /**
     * Fields
     */
    protected double x;
    protected double y;
    protected int width;
    protected int height;
    protected int hitpoint;
    protected int experience;
    protected int strength;
    /**
     * Constructor for objects of class GameObject
     */
    public GameObject()
    {
        // To do:
    }
    /**
     * Abstract methods
     */
    protected abstract int action(GameObject obj);
    protected abstract void response(GameObject obj);
    /**
     * Methods
     */
    protected void moveTo(double x,double y) {
        this.x=x;
        this.y=y;
    }    
    protected boolean collisionRequest(GameObject obj) {
        if((x>obj.x+obj.width)
            ||(y>obj.y+obj.height)
            ||(obj.x>x+width)
            ||(obj.y>y+height)) {
                return false;
        }
        response(obj);
        return true;
    }
    
}
