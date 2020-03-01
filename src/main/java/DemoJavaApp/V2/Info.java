package DemoJavaApp.V2;


/**
 * Abstract class Info - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Info
{
    protected Object source;
    public Info(Object source) {
        this.source=source;
    }
    public abstract Object getSource();
    public void setSource(Object source) {
        this.source=source;
    }
}
