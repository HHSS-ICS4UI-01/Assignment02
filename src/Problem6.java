
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
    
    static int marbles(int[] array, int max) 
    {
        if(array.length == 0) {
            return 0;
        }
        //if a bag has the exact maximum it returns the maximum
        for(int i = 0; i < array.length; i ++) 
        {
            if(array[i] == max) 
            {
                return max;
            }
        }
        
        
        int[] leftOvers = new int[array.length - 1];
        int aBag = array[0];
        for(int i = 0; i <leftOvers.length; i++) {
            leftOvers[i] = array[i+1];
        }
        int with = aBag + marbles(leftOvers, max - aBag);
        int withOut = marbles(leftOvers, max);
        
        if(with > withOut  && with < max) {
            return with;
        } else if(withOut <= max) {
            return withOut;
        } else {
            return 0;
        }
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the maximum amount of marbles: ");
        //Getting the maximum can fit into the box
        int max = input.nextInt();
        
        System.out.print("Enter the number of bags: ");
        //getting the number of bags of marbles
        int bags = input.nextInt();
        
        int array[] = new int[bags];
        
        //getting how many marbles are in each bag
        for(int i = 0; i < array.length; i ++) 
        {
            System.out.print("How many marbles are in bag " + i + "? ");
            
            array[i] = input.nextInt();
        }
        
        //outputting the maximum amount of marbles that can fit
        System.out.println(marbles(array, max));
        
    }
}
