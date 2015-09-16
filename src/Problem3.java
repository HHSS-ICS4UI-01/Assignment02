
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    
    static int binary(int n) 
    {
        if(n == 0 || n == 1) 
        {
            return n;
            
        } else {
            return n ;
            
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Enter a number to convert to binary: ");
        
        int num = input.nextInt();
        
        System.out.println(num + " in binary is " + binary(num));
        
    }
}
