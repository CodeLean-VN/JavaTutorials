package Inheritance;

/**
 * Write a description of class Felidae here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mammal extends Animal
{
    /**
     * Constructor for objects of class Felidae
     */
    public Mammal()
    {
        // To do:
    }
    protected Mammal haveBaby() {
        return new Mammal();
    }
}
