/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem5 {
    public static boolean isPalindrome (String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length() -1)){
            return isPalindrome(s.substring(1,s.length() -1));
        }else{
            return false;
        }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
