
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
    
    static boolean isPalindrome(String s) 
    {
        if(s.length() == 0 || s.length() == 1) 
        {
            return true;
        }
             
        if(s.charAt(0) == s.charAt(s.length()-1)) 
        {
         // check for first and last char of String:
         //if they are same then do the same thing for a substring with first and last char removed
         //Repeat until string completes or condition fails
         
        return isPalindrome(s.substring(1, s.length()-1));
        }
        //If program reaches this return that means that it is false
        return false;
        
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        
        String word = input.nextLine();
        
        int length = word.length();
        
        boolean palindrome = isPalindrome(word);
        
        //Differing statements depending on what is returned 
        if(palindrome) {
            System.out.println(word + " is a palindrome");
        }
        
        if(!palindrome) {
            System.out.println(word + " is not a palindrome");
        }
        
        
    }
}
