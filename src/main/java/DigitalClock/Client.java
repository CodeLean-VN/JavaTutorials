package DigitalClock;

import equipments.DigitalClock;
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
    
    public static void main(String[] agrs) {
        DigitalClock clock=new DigitalClock();
        for(int i=0;i<1000;i++) {
            clock.tick();
        }
    }
}
