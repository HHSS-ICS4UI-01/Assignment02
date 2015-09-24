
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
    
    static String convert(int n, int b)
    {
        if(n == 0)
        {
            return "0";
        }if(n == 1)
        {
            return "1";
        }if(n == 2)
        {
            return "2";
        }if(n == 3)
        {
            return "3";
        }if(n == 4)
        {
            return "4";
        }if(n == 5)
        {
            return "5";
        }if(n == 6)
        {
            return "6";
        }if(n == 7)
        {
            return "7";
        }if(n == 8)
        {
            return "8";
        }if(n == 9)
        {
            return "9";
        }if(n == 10)
        {
            return "A";
        }if(n == 11)
        {
            return "B";
        }if(n == 12)
        {
            return "C";
        }if(n == 13)
        {
            return "D";
        }if(n == 14)
        {
            return "E";
        }if(n == 15)
        {
            return "F";
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
        //System.out.println("Enter in a number to convert to binary");
        //int num = input.nextInt();
        //System.out.println(num + " in binary is " + binaryConvert(num));
        
    }
}
