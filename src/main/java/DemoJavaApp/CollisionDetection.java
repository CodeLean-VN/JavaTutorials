package DemoJavaApp;
/**
 * Write a description of class CollisionDetection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CollisionDetection
{
	public CollisionDetection()
	{
	}
	public boolean checkObject(GameObject objectA, List objects)
	{
	    boolean collision = false;
	    for (int i=0; i<objects.size(); i++) {
	        GameObject objectB = (GameObject)objects.get(i);
	        collision |= checkObject(objectA, objectB);
	    }
	    return collision;
	}
	public boolean checkObject(GameObject objectA,GameObject objectB)
	{
	    // don't collide with self
	    if (objectA == objectB) {
	        return false;
	    }
	    float dx = objectA.getX() - objectB.getX();
	    float dy = objectA.getY() - objectB.getY();
	    float minDist = objectA.getR() + objectB.getR();
	    float distSq = dx*dx + dy*dy;
	    float minDistSq = minDist * minDist;
	    if (distSq < minDistSq) {
	         return handleObjectCollision(objectA, objectB, distSq,minDistSq);
	    }
	    return false;
	}
	protected boolean handleObjectCollision(GameObject objectA,GameObject objectB, float distSq, float minDistSq)
	{
	    objectA.notifyObjectCollision(objectB);
	    return true;
	}
}
