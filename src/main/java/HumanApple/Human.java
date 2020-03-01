package HumanApple;

/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human
{
    /**
     * Fields
     */
    private String name;
    private boolean gender;
    private int weight;
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        // To do:
    }
    /**
     * Methods
     */
    public String getName() {
        return name;
    }
    public void setName(String value) {
        name=value;
    }
    public boolean isMale() {
        return gender;
    }
    public void setGender(boolean value) {
        gender=value;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int value) {
        weight=value;
    }
    public boolean checkApple(Apple apple) {
        if(apple.getWeight()<=0) {
            return true;
        }
        return false;
    }
    public void eat(Apple apple) {
        if(checkApple(apple)) {
            weight++;
            apple.decrease();
        }
    }
    public void say(String words) {
        System.out.println(words);
    }
}
