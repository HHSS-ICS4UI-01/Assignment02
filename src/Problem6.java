
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
        //if a bag has the exact maximum it returns the maximum
        for(int i = 0; i < array.length; i ++) 
        {
            if(array[i] == n) 
            {
                return n;
            }
        }
        //if the maximum is 0 no marbles can fit
        if(n == 0) 
        {
            return 0;
        } else {
            int biggest = 0;
            for(int i = 0; i < array.length; i ++) 
            {
                if(array[i] > biggest) {
                    array[i] = biggest;
                }
            }
            return marbles(n, array);
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
        System.out.println(marbles(max, array));
        
    }
}
