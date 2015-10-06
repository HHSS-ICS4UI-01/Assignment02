
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(convert(14, 14));
    }
    
    /**
     * Calculates the sum of all the digits in an integer.
     * @param n a non-negative integer.
     * @return n, if n is less than 10; otherwise, the sum of all the digits in the number.
     */
    public static int sumDigits(int n)
    {
        if (n < 10) // there is only one digit
        {
            return n;
        }
        return n%10 + sumDigits(n/10); // returns the sum of the last digit with the sum of the other digits
    }
         
    /**
     * Finds the sum of all the layers in a triangle (eg, triangle w/ 3 layers gives 1+2+3 = 6).
     * @param n the number of layers in the triangle.
     * @return 0, if the number of rows is 0; otherwise, the sum of rows in triangle.
     */
    public static int triangle(int n)
    {
        if (n == 0) // no rows in triangle
        {
            return 0;
        }
        // returns last row + all previous rows
        return n + triangle(n-1);
    }
    
    /**
     * Converts integers from a decimal system into binary
     * @param n the non-negative integer to be converted.
     * @return n, if n is less than 2; otherwise, return binary conversion of n.
     */
    public static String binaryConvert(int n)
    {
        if (n < 2) // n is less than 2, thus 0-n is a sufficient conversion
        {
            return "" + n;
        }
        return "" + binaryConvert(n/2) + n%2; // returns the conversion of (n/2) into the same base (2)
    }
    
    /**
     * Converts integers from a decimal system into a specified base system
     * @param n the non-negative integer to be converted.
     * @param b the target base of the conversion.
     * @return returns hex string conversion of n, if n is less than b; otherwise, returns the conversion of (n/b) into the same base (b).
     */
    public static String convert(int n, int b)
    {
        if (n < b) // n is less than b, thus 0-b is a sufficient conversion
        {
            return Integer.toHexString(n).toUpperCase(); // the hexadecimal conversion of n
        }
        return "" + convert(n/b, b) + Integer.toHexString(n%b).toUpperCase(); // returns the reversed string of all the remainders of n%b, converted into hexadecimal
    }
    
    /**
     * Checks whether or not a word is a palindrome.
     * @param s the string to be compared.
     * @param length the length of the string.
     * @return 
     */
    public static boolean isPalindrome(String word, int length)
    {
        if (length <= 0) // any string of length 0 is a palindrome
        {
            return true;
        }
        
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(length-1);
        String shortenedWord = word.substring(1, length);
        
        // returns whether or not the first and last chars match AND if the middle contents of the word are also a palindrome
        return firstChar == lastChar && isPalindrome(shortenedWord, shortenedWord.length()); 
    }
    
    /**
     * Jimmy has a box of a certain marble capacity. He also has multiple bags, unable to be opened, which contain a fixed number of marbles.
     * This method determines the largest number of marbles which can fit into his box.
     * @param bags an array containing the number of marbles in each bag
     * @param limit the maximum number of marbles the box can accommodate
     * @return 
     */
    public static int jimmysMarbles(int[] bags, int limit)
    {
        if (bags.length == 0) // if there are no bags to chose from, the max number of numbers is by default 0
        {
            return 0;
        }
        // duplicate version of bags with the first entry omitted. This is used in the recursive computations
        int[] shortened = Arrays.copyOfRange(bags, 1, bags.length);
        
        // assuming first bag was chosen:
        int newLimit = limit - bags[0]; // decrement the marble limit by the amount that was added, to be used by next iteration
        int chosen = bags[0] + jimmysMarbles(shortened, newLimit);
        // assuming first bag was not chosen:
        int notChosen = jimmysMarbles(shortened, limit); // keep same limit as no marbles were added
            
        // returns the largest value which is less than or equal to the limit
        if (chosen <= limit && chosen > notChosen) // because of the limit difference between chosen and notChosen, chosen could potentially be smaller than notChosen
        {
            return chosen;
        }
        return notChosen;
    }
}
