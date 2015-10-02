
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem2
{
    static int triangle(int n)
    {
        if (n==0 || n==1)
            return n;
        else
            return n +triangle(n-1);
        
    }
    
    public static void main(String[] args) 
    {
        Scanner stuff = new Scanner (System.in);
        System.out.println("Please enter the number of rows that the triangle is made of: ");
        int n = stuff.nextInt();
        int amount= triangle(n);
        System.out.println("The triangle is made of " +amount +" blocks.");


    }
}
