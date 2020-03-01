package InnerClass;

/**
 * Write a description of class Client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Client {
    /**
     * Constructor for objects of class Client
     */
    public Client() {
        // To do:
    }
    public void runDemo() {
        int[] array=new int[] {2,3,4,5,3,7,5,4,45,34};
        
        final IntegerManager manager=new IntegerManager(array);
        
        Iterator oddNumberList=new Iterator() {
                private int currentIndex=-1;
                public boolean hasNext() {
                    currentIndex++;
                    if (currentIndex >= manager.getlist().length-1){
                     return false;
                    }
                    while(manager.getlist()[currentIndex]%2==0) {
                        currentIndex++;
                    }                
                    if (currentIndex < manager.getlist().length) {
                        return true;
                    }
                    return false;
                }
                public int getNext() {
                    return manager.getlist()[currentIndex];
                }
        };
        
        Iterator evenNumberList=new Iterator() {
                private int currentIndex=-1;
                public boolean hasNext() {
                    currentIndex++;
                    if (currentIndex >= manager.getlist().length-1){
                     return false;
                    }
                    while(manager.getlist()[currentIndex]%2!=0) {
                        currentIndex++;
                    }                
                    if (currentIndex < manager.getlist().length) {
                        return true;
                    }
                    return false;
                }
                public int getNext() {
                    return manager.getlist()[currentIndex];
                }
        };
        
        manager.printNumber(oddNumberList);
        manager.printNumber(evenNumberList);
    }
}
