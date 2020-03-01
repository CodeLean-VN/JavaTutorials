package InnerClass;

/**
 * Write a description of class IntegerManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntegerManager {
    private int[] list;
    /**
     * Constructor for objects of class IntegerManager
     */
    public IntegerManager(int[] list) {
        // To do:
        this.list=list;
    }
    
    public void printNumber(Iterator data) {
        while(data.hasNext()) {
            System.out.println(data.getNext());
        }
    }
    
    public int[] getlist() {
        return list;
    }
    
    public class OddNumberList implements Iterator{
        private int currentIndex=-1;
        public boolean hasNext() {
            currentIndex++;
            if (currentIndex >= getlist().length-1){
                return false;
            }
            while(getlist()[currentIndex]%2==0) {
                currentIndex++;
            }                
            if (currentIndex < getlist().length) {
                return true;
            }
            return false;
        }
        public int getNext() {
            return getlist()[currentIndex];
        }
    }
    
    public class EventNumberList implements Iterator{
        private int currentIndex=-1;
        public boolean hasNext() {
            currentIndex++;
            if (currentIndex >= getlist().length-1){
                return false;
            }
            while(getlist()[currentIndex]%2!=0) {
                currentIndex++;
            }                
            if (currentIndex < getlist().length) {
                return true;
            }
            return false;
        }
        public int getNext() {
            return getlist()[currentIndex];
        }
    }
}
