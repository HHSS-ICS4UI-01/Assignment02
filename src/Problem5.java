
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johns6971
 */
public class Problem5 {

    /**
     * @param args the command line arguments
     */
    
    static boolean isPalindrome(String s, int length) 
    {
        if(length == 1) {
            return true;
        }
        
        return false;
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        
        String word = input.nextLine();
        
        int length = word.length();
        
        boolean palindrome = isPalindrome(word, length);
        
        if(palindrome) {
            System.out.println(word + " is a palindrome");
        }
        
        if(!palindrome) {
            System.out.println(word + " is not a palindrome");
        }
        
        
    }
}
