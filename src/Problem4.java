
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem4 
{
    static String convert(int n, int b)
    {
        if (n==0||n==b)
            return "" + n;
        else if(b>10&&n==10)
            return "A";
        else if(b>10&&n==11)
            return "B";
        else if(b>10&&n==12)
            return "C";
        else if(b>10&&n==13)
            return "D";
        else if(b>10&&n==14)
            return "E";
        else if(b>10&&n==15)
            return "F";
        else
            return convert(n/b,b) + n%b;
    }
    
    public static void main(String[] args) 
    {
        Scanner stuff = new Scanner (System.in);
        
        System.out.println("Please enter the number you wish to convert: ");
        int n=stuff.nextInt();
        System.out.println("Please enter the base number you wich to convert too: ");
        int b=stuff.nextInt();
        String output=convert(n,b);
        System.out.println(output);
        
        
        
    }
    
}
