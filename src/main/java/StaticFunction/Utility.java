package StaticFunction;

import java.util.Scanner;
/**
 * Write a description of class Lab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utility
{
    /**
     * An example of a method - replace this comment with your own
     */
    public static void demoVariable()
    {
        //Declare variables
        int n=10;
        long m;
        double d;
        char c;
        boolean flag;
        double exp;
        
        m=2000L;
        d=3.14;
        c='X';
        flag=true;
        
        exp=n+m+d+c;
        
        System.out.println("Demo Variable");
        System.out.println("n="+n);
        System.out.println("m="+m);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("flag="+flag);
        System.out.println("exp="+exp);
    }
    public static boolean checkNumber(int n){
        if(n%2==0) {
            return true;
        }
        return false;
    }
    public static int sum(int n) {
        int s=0;
        for(int i=0;i<n;i++) {
            s=s+i;
        }
        return s;
    }
    
    public static void main(String[] agrs) {
        Scanner input=new Scanner(System.in);
        
        int n;
        System.out.println("Enter n:");
        n=input.nextInt();
        if(checkNumber(n)) {
            System.out.println("Even Number!");
        }else{
            System.out.println("Odd Number!");
        }
    }
}
