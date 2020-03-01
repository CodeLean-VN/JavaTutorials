package ArrayLedBoard;

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    /**
     * Fields
     */
    private Led[][] board;
    private int currentColumn;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        // To do:
        board=new Led[3][10];
        for(int i=0;i<3;i++) {
            for(int j=0;j<10;j++) {
                board[i][j]=new Led();
            }
        }
    }
    public void turnOnColumn(int col) {
        for(int i=0;i<3;i++) {
            board[i][col].on();
        }
    }
    public void turnOffColumn(int col) {
        for(int i=0;i<3;i++) {
            board[i][col].off();
        }
    }    
    public void show() {
        turnOffColumn(currentColumn);
        currentColumn++;
        if(currentColumn>9) {
            currentColumn=0;
        }
        turnOnColumn(currentColumn);
        //Display
        for(int i=0;i<3;i++) {
            for(int j=0;j<10;j++) {
                board[i][j].display();
            }
            System.out.println();
        }
    }
}
