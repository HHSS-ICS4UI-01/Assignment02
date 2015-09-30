
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    
    static int sumDigits(int n) 
    {
        if(n/10 < 1) 
        {
            return n;
        } else {
            return sumDigits(n % 10) + sumDigits((n / 10)% 10) + sumDigits((n /100)%10);
        }
        
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        
        int num = input.nextInt();
        
        System.out.println(sumDigits(num));
        
        
    }
}
