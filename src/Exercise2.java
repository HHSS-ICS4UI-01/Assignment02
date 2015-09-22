
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
    {
        if(n >= 0 && n <=9)
        {
            return n;
        }else
        {
            int q = n / 10;
            int r = n % 10;
            return r + sumDigits(q);
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
    
    static int binaryConvert(int n)
    {
       return 1;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Problem 1
        //System.out.println("Enter in a number to receive it's sum of digits:");
        //int num = input.nextInt();
        //System.out.println("The sum of " + num + " is " + sumDigits(num));
        
        //Problem 2
        //System.out.println("Enter in the amount of rows:");
        //int num = input.nextInt();
        //System.out.println("The amount of blocks in a triangle with " + num + 
                //" rows is " + triangle(num));
        
        //Problem 3
        System.out.println("Enter in a number to convert to binary");
        int num = input.nextInt();
        System.out.println();
        
    }
}
