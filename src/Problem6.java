
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    
    static int marbles(int n, int[] array) 
    {
        if(n == 0) 
        {
            return 0;
        } else {
            return marbles(n - 5, array);
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the maximum amount of marbles: ");
        
        int max = input.nextInt();
        
        System.out.print("Enter the number of bags: ");
        
        int bags = input.nextInt();
        
        int array[] = new int[bags];
        
        for(int i = 0; i < array.length; i ++) 
        {
            System.out.print("How many marbles are in bag " + i + "? ");
            
            array[i] = input.nextInt();
        }
        
        
        System.out.println(marbles(max, array));
        
    }
}
