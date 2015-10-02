
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem1 
{
    static int sumOfDigits(int n)
    {
        if(n >=0 && n <10)
            return n;
        else
            return n%10 + sumOfDigits(n/10);        
    }
    
    public static void main(String[] args) 
    {
        Scanner stuff = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        int n= stuff.nextInt();
        int sums =sumOfDigits(n);
        System.out.println("The sum of the digits entered is: " +sums +".");
    }
}
