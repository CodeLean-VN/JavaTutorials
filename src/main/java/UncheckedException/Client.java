package UncheckedException;

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
    
    public void doUnchecked(String value) {
        // Can phai check exception, neu khong --> bug
        int result=canThrowUncheckedException(value);
        System.out.println("result="+result);
    }
    
    private int canThrowUncheckedException(String value) throws NumberFormatException{
        return Integer.parseInt(value);
    }
    
    public void doChecked() {
        try {
            // Buoc phai check exception o day! Khong cach nao khac
            canThrowCheckedException(); 
            System.out.println("OK");
        }catch(Exception ex) {
            System.out.println(ex);
        }
    }
    
    private int canThrowCheckedException() throws Exception{
        throw new Exception("Failure");
    }
}
