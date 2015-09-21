

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem2 {
    static long trig(int n) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n==1)
        {
            return 1;
        }else
        {
            int row = n;
            return trig(n-1) + row;
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
            System.out.println(trig(n));
        }
    }
}
