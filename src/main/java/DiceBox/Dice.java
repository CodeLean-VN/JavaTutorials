package DiceBox;

/**
 * Write a description of class Dice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dice
{
    private int[] faces=new int[]{1,2,3,4,5,6};
    private int topIndex;
    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // To do:
        topIndex=1;
    }
    public int getTop() {
        return faces[topIndex];
    }
    public void setTop(int value) {
        if(value>0&&value<7) {
            topIndex=value;
        }
    }
}
