package PackageMouse;

import hardwares.Mouse;
import animals.Cat;
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
    public void runDemo() {
        Mouse m=new Mouse();        
        m.click();
        
        Cat r=new Cat();
        
        animals.Mouse m2=new animals.Mouse();
        m2.eat();
    }
}
