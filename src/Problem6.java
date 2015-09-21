
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
    static int marbles(int max, int[]array) 
    {
        if(max == 0) {
            return 0;
        } else {
            return marbles(max, array);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the maximum amount of marbles that can be put in the box: ");
        
        int max = input.nextInt();
        
        System.out.print("Enter how many bags of marbles you have: ");
        
        int bags = input.nextInt();
        
        System.out.print("Enter how many marbles are in each bag: ");
        
        int[] array = new int[bags];
        
        for(int i = 0; i < array.length; i ++) 
        {
            array[i] = input.nextInt();
        }
        
        
        System.out.println("You can fit a total of " + marbles(max, array) + " marbles in the box");
        
        
    }
}
