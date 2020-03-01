package DiceBox;

/**
 * Write a description of class DiceBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceBox
{
    // instance variables - replace the example below with your own
    private Dice[] dices;

    /**
     * Constructor for objects of class DiceBox
     */
    public DiceBox()
    {
        // initialise instance variables
    }
    
    public void random(Dice[] dices) {
        this.dices=dices;
        
    }
    public int getTotal() {
        return 0;
    }
    public void showAll() {
    }
}
