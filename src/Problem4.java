
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
                return (convert(n/b) + "0");
            }else if(n%b==1)
            {
                return (convert(n/b) + "1");
            }else if(n%b==2)
            {
                return (convert(n/b) + "2");
            }else if(n%b==3)
            {
                return (convert(n/b) + "3");
            }else if(n%b==4)
            {
                return (convert(n/b) + "4");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non negative whole number");
        int n = input.nextInt();
        
        System.out.print("Please enter a non negative whole number");
        int b = input.nextInt();
        
        if(n < 1 || b < 1 || b > 16)
        {
            System.out.println("Please follow directions!!!");
        }else
        {
            System.out.println(convert(n,b));
        }
    }
}
