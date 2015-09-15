
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
    static int sumDigits(int n)
    {
        if(n == 0)
        {
            return 1;
        }else{
            return (n%10) + ((n/10) %10);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println(sumDigits(num));
    }
}
