package DemoJavaApp.V2;

import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World implements CollisionListener{
    /**
     * Constructor for objects of class World
     */
    public World() {
        // To do:
    }
    public void run() {
        Ball b=new Ball();
        ball.addCollistionListener(this);
    }
    public void notify(Info obj) {
        
    }
}
