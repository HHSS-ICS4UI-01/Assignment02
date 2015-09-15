
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem2 {

    /**
     * @param args the command line arguments
     */
    
    
    static int blocks(int n) 
    {
        if(n == 0 || n == 1)
        {
            return n;
            
        } else {
            return blocks(n - 1) + blocks(n + 1);
            
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        
        int rows = input.nextInt();
        
        System.out.println("There is " + blocks(rows) + " blocks");
        
    }
}
