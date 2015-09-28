
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bag a, bag b, etc
        //take the amount of marbles in the bag away from the amount box can hold
        //take away the bag and move on to the next
        //see if the # marbles excedes the amount the box can hold
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max number of marbles the box can hold");
        int b = in.nextInt();
        System.out.println("enter number of bags");
        int d = in.nextInt();
        int[] e = new int[d];
        for(int i = 0; i < e.length; i++){
            System.out.println("enter number of marbles in each bag");
            e[i] = in.nextInt();
        }
        int ans = marbles(b,e);
        System.out.println("the max amount of marbles " + ans);
        
    }
    static int marbles(int maxMar, int[] numMarInBags){
        //if i don't have any space left, and or if i have nothing left to put in
        if ( maxMar == 0 || numMarInBags.length == 0){
            return 0;
        }
        
        //taking the value of the first interger in the array
        int numMarbles = numMarInBags[0];
        
        //taiking the leftover array and putting it into a new array
        int [] leftover = new int[numMarInBags.length-1];
        for(int i = 1; i < numMarInBags.length; i++){
            leftover[i-1] = numMarInBags[i];
        }
        //finding the combination to get the most marbles possible
        //with the first bag
        int with = marbles(maxMar - numMarbles, leftover ) + numMarbles;
        //without the first bag
        int without = marbles(maxMar, leftover );
        
        //checking which of the two integers are bigger, while not exceeding the maximum amount of marbles
        if (with > without && with <= maxMar){
            return  with;
        }else if ( with < without && without <= maxMar){
            return without;
        
        //if there is no possible combination within the paramters
        }else{
            return 0;
        }
    }
    
}
