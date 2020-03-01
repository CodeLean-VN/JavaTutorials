package ArrayIntegerManager;

/**
 * Write a description of class IntegerManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntegerManager
{
    private int[] array;
    /**
     * Constructor for objects of class IntegerManager
     */
    public IntegerManager()
    {
        // To do:
    }
    public IntegerManager(int[] array) {
        this.array=array;
    }
    public void setArray(int[] array) {
        this.array=array;
    }
    public int[] toArray() {
        return array;
    }
    public void initArray(int initValue) {
        for(int i=0;i<array.length;i++) {
            array[i]=initValue;
        }
    }
    public int getValueAt(int index) {
        return array[index];
    }
    public void setValueAt(int index, int value) {
        array[index]=value;
    }
    public void sortArray(boolean asc) {
        int temp;
        for(int i=array.length-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                if(asc) {
                    if(array[i]>array[j]) {
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }else{
                    if(array[i]<array[j]) {
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;
                    }
                }
            }
        }
    }
    public int find(int value) {
        return -1;
    }
    public int getLength() {
        return array.length;
    }
}
