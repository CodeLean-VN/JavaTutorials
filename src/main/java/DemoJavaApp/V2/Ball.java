package DemoJavaApp.V2;
import java.util.*;

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball implements CollisionListener {
    /**
     * Constructor for objects of class Ball
     */
    private List list=new ArrayList();
    public Ball() {
        // To do:
    }
    
    public void update(long time) {
    }
    
    public void notifyWhenCollisionFire(Object obj) {
        System.out.println("binh");   
    }
    public void addListener(CollisionListener l) {
        list.add(l);
    }
    public void removeListener(CollisionListener l) {
        list.remove(l);
    }
    public List getListener() {
        return list;
    }
}
