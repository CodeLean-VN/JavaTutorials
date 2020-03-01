package MessagePassing;

/**
 * Write a description of class Manager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Manager {
    /**
     * Constructor for objects of class Manager
     */
    public Manager() {
        // To do:
    }
    public String request(Employee employee) {
        employee.setName("007");
        return "ok";
    }
}
