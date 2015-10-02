
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem6 {
    
    
    
    public static void main(String[] args) {
        Scanner stuff=new Scanner(System.in);
        
        System.out.println("How many marbles can it hold? ");
        int max=stuff.nextInt();
        
        System.out.println("Please enter the number of bags");
        int length=stuff.nextInt();
        
        int[]  bags= new int[length];
        for (int i = 0; i < length; i++) {
            if (i==0) 
                System.out.print("Please enter the number of marbles in the "+(i+1) +"st bag. ");
            if (i==1)
                System.out.print("Please enter the number of marbles in the "+(i+1) +"nd bag. ");
            if (i==2)
                System.out.print("Please enter the number of marbles in the "+(i+1) +"rd bag. ");
            if (i>=3)
                System.out.print("Please enter the number of marbles in the "+(i+1) +"th bag. ");
            
            bags[i]=stuff.nextInt();
            System.out.println("");
        }
        
        
        int output= marbles(bags, max);
        System.out.println(output);
    }
    
    public static int marbles(int[] bags, int max){
        if(bags.length==0)
            return 0;
        int[] leftOvers= new int[bags.length-1];
        int aBag=bags[0];
        for (int i = 0; i < leftOvers.length; i++)
            leftOvers[i]=bags[i+1];
        int with=aBag+marbles(leftOvers, max-aBag);
        int withOut=marbles(leftOvers, max);
        if(with>withOut&&with<=max)
                return with;
        else if(with<withOut&&withOut<=max)
                return withOut;
        else
            return 0;
        
    }
}
