/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        isPalindrome("racecar",7);
        
    }
     static boolean isPalindrome(String s, int length){
         if (length == 1 || length == 0){
             return true;
         }else{
             boolean word = s.charAt(0) == s.charAt(length - 1);
             String leftover = s.substring(1,length - 1);
             return word && isPalindrome(leftover,length - 2);
         }
     }
}
