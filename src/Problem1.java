
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
        int num = input.nextInt();
        System.out.println(triangle(num));
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
    static int binaryConvert(int n)
    {
        
        if(n == 1)
        {
            return n;
        }else{
            return binaryConvert(n/2) + ;
        }
        
    }
    
    
    
}
