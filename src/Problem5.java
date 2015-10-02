
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Problem5{
    
    public static boolean isPalindrome(String s, int length){
        if(length<=1)
            return true;
        else if(s.charAt(0)==s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1),length-2);
        else
            return false;
    }
    
    public static void main(String[] args) 
    {   
        Scanner stuff=new Scanner(System.in);
        
        System.out.print("Please enter a word to see if it is a Palindrome: ");
        String input=stuff.nextLine();
        System.out.println("");
        
        System.out.print("Please enter the number of letters in the word: ");
        int length=stuff.nextInt();
        System.out.println("");
        boolean output=isPalindrome(input,length);
        if(output)
            System.out.println("The word: "+input+", is a palindrome.");
        else
            System.out.println("The word: "+input+", is not a palindrome.");
    }
}
