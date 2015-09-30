
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem1 {
    static long sumDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }else
        {
            int lD = n/10;
            int rD = n%10;
            return sumDigits(lD) + rD;
            
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
        if(n <= 1)
        {
            System.out.println("Please follow directions!!!");
        }else
        {
            System.out.println(sumDigits(n));
        }
   
    }
}
