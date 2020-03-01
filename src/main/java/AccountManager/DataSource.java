package AccountManager;

/**
 * Write a description of class DataSource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataSource
{
    public Data[] table=new Data[] {
        new Data("abc","123","Nguyen Van",1,0),
        new Data("abcd","1234","Nguyen Thi",2,0),
        new Data("abcde","12345","Pham Van",2,0),
    };
    /**
     * Constructor for objects of class DataSource
     */
    public DataSource()
    {
        // To do:
    }
    public class Data {
        public String username;
        public String password;
        public String fullname;
        public int accountType;
        public int status;
        public Data(String username,String password,String fullname,int type,int status) {
            this.username=username;
            this.password=password;
            this.fullname=fullname;
            this.accountType=type;
            this.status=status;
        }
    }
}
