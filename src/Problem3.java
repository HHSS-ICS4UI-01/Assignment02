
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem3 {
    
static long binaryConvert(int n) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        else
        {
            int remander = n;
            return binaryConvert(n/2) + remander;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non negative whole number: ");
        int n = input.nextInt();
        if(n < 1)
        {
            System.out.println("Please follow directions!!!");
        }else
        {
            System.out.println(binaryConvert(n));
        }
    }
}
