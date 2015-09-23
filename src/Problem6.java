
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
//        public static int numPlanets(int n, int k)
//{
//     if(k == 0 || n == k)
//     {
//          return 1;
//     }else if(k > n)
//     {
//          return 0;
//     }
//     return numPlanets(n - 1, k - 1) + numPlanets(n - 1, k)
//}
        
        
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
        int c = 0;
        if ( maxMar == 0){
            return 0;
        }
        
        int numMarbles = numMarInBags[0];
        int [] leftover = new int[numMarInBags.length-1];
        for(int i = 1; i < numMarInBags.length; i++){
            leftover[i-1] = numMarInBags[i];
        }
        
        int with = marbles(maxMar - numMarbles, leftover ) + numMarbles;
        int without = marbles(maxMar, leftover );
        
        if (with > without){
            return with;
        }else if ( with < without){
            return without;
        }
        return -1;
    }
    
}
