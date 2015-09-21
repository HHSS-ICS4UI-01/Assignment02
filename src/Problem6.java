
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
        System.out.println("enter number of bags");
        int d = in.nextInt();
        int[] e = new int[d];
        for(int i = 0; i < e.length; i++){
            System.out.println("enter number of marbles");
            e[i] = in.nextInt();
            if (e[i] == 2){
                
            }
        }
        marbles(50,e);
        
    }
    static int marbles(int maxMar, int[i] numMarInBags){
        
        return marbles(maxMar - numMarIn, k - 1) + numPlanets(n - 1, k)
    }
    }
}
