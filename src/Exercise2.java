
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    static int sumDigits(int n)
    {   //if the number is 1 digit long
        if(n >= 0 && n <=9)
        {
            return n; //return that digit
        }else
        {   //remove the last digit from the number
            int q = n / 10; //set the removed digit
            int r = n % 10; //set the remainder
            return r + sumDigits(q); //loop 
        }
    }
    
    static int triangle(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }else
        {
            return n + triangle(n - 1);
        }
    }
    
    static String binaryConvert(int n)
    {
       if(n == 0)
       {
           return "0";
       }if(n == 1)
       {
           return "1";
       }
       if(n % 2 == 0)
       {
           return (binaryConvert(n/2) + "0");
       }
       else
       {
           return (binaryConvert(n/2) + "1");
       }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Problem 1
        //System.out.println("Enter in a number to receive it's sum of digits:");
        //int num = input.nextInt();
        //System.out.println("The sum of " + num + "'s digits is " + sumDigits(num));
        
        //Problem 2
        //System.out.println("Enter in the amount of rows:");
        //int num = input.nextInt();
        //System.out.println("The amount of blocks in a triangle with " + num + 
        //" rows is " + triangle(num));
        
        //Problem 3
        System.out.println("Enter in a number to convert to binary");
        int num = input.nextInt();
        System.out.println(num + " in binary is " + binaryConvert(num));
        
    }
}
