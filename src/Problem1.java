
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murra9546
 */
public class Problem1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println("Enter a base");
        int b = input.nextInt();
        System.out.println(convert(n,b));
    }
    
    //problem 1
    static int sumDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }else{
           return n%10 + sumDigits(n/10);
        }
        
    }
    
    //problem 2
    static int triangle(int n)
    {
        if(n == 1)
        {
            return n;
        }else {
            return n + triangle(n-1);
        }
    }
    
    //problem 3    
    static String binaryConvert(int n)
    {
        int q = 0;
        int r = 0;
     
        if(n == 1)
        {
            return "1";
        }else{
            r = n%2;
            q = n/2;
            return binaryConvert(q) + r;
        }
        
    }
    
    static int convert(int n, int b)
    {
        
    }
    
}
