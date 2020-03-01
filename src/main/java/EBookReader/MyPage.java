package EBookReader;

/** Write a description of class MyPage here.
  * 
  * @author (your name) 
  * @version (a version number or a date)
  */
public class MyPage extends Page
{
    protected Line[] lines;
    /**
     * Constructor for objects of class MyPage
     */
    public MyPage(Line[] lines,int index)
    {
        // To do:
        this.lines=lines;
        this.index=index;
    }
    public void show() {
        for(Line li : lines) {
            System.out.println(li.getString());
        }
    }
}
