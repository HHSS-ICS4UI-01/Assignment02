
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem4 {
    static String convert(int n,int b) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n==1)
        {
            return "1";
        }
        if(n==0)
        {
            return "0";
        }
        else
        {
            if(n%b==0)
            {
                return (convert(n/b, b) + "0");
            }else
            
                return (convert(n/b, b) + "1");
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non negative whole number to convert: ");
        int n = input.nextInt();
        
        System.out.print("Please enter a non negative whole number to covert the base: ");
        int b = input.nextInt();
        
        if(n < 1 || b < 2 || b > 16)
        {
            System.out.println("Please follow directions!!!");
        }else
        {
            System.out.println(convert(n,b));
        }
    }
}
