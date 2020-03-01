package Rectangle;

/**
 * Write a description of class Rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rectangle
{
    /**
     * Fields
     */
    private int width;
    private int height;
    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        // To do:
        width=7;
        height=2;
    }
    public Rectangle(int width,int height)
    {
        // To do:
        this.width=width;
        this.height=height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int value) {
        width=value;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int value) {
        height=value;
    }
    public void display() {
    }
    public int getArea() {
        return width*height;
    }
    public int getPerimeter() {
        return 2*(width+height);
    }
}
