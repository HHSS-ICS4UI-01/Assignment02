

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem3
{
    static String binaryConvert(int n)
    {
        if (n==0 || n==1)
            return "" + n;
        else
            return binaryConvert(n/2) + n%2;
    }
    
    public static void main(String[] args)
    {
        Scanner stuff = new Scanner(System.in);
        
        System.out.print("Please enter a positive iniger: ");
        int n= stuff.nextInt();
        String output=binaryConvert(n);
        System.out.println("The number in binary is " +output +".");

            
        
    }
}
