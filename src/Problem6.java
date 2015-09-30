/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem6 {
    public int marbles(int[] bags, int max){
        if(bags.length==0){
            return 0;
        }
        int[] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];
        for(int i = 0; i < leftOvers.length; i++){
            leftOvers[i] = bags[i+1];
        }
        int with = aBag + marbles(leftOvers, max - aBag);
        int withOut = marbles(leftOvers,max);
        
        if(with > withOut && with < max){
            return with;
        }else if(withOut < max){
            return withOut;
        }else{
            return 0;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //32,17,12,13,5
    }
}
