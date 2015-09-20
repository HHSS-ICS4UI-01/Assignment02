
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
        System.out.println(jimmysMarbles(new int[]{12 ,14 ,18 ,33, 34}, 50));
    }
    
    public static int sumDigits(int n)
    {
        if (n < 10)
        {
            return n;
        }
        return n%10 + sumDigits(n/10);
    }
            
    public static int triangle(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + triangle(n-1);
    }
    
    public static String binaryConvert(int n)
    {
        if (n < 2)
        {
            return "" + n;
        }
        return "" + binaryConvert(n/2) + n%2;
    }
    
    public static String convert(int n, int b)
    {
        if (n < b)
        {
            return Integer.toHexString(n).toUpperCase();
        }
        return "" + convert(n/b, b) + Integer.toHexString(n%b).toUpperCase();
    }
    
    public static boolean isPalindrome(String s, int length)
    {
        if (length <= 0)
        {
            return true;
        }
        return s.charAt(0) == s.charAt(length-1) && isPalindrome(s.substring(1, length), length-2);
    }
    
    public static int jimmysMarbles(int[] bags, int limit)
    {
        if (bags.length == 0) // base case, number was not selected
        {
            return 0;
        }
        int[] shortened = Arrays.copyOfRange(bags, 1, bags.length);
        
        // assuming first bag was chosen:
        int newLimit = limit - bags[0]; // decrement the marble limit by the amount that was added, for the next iteration
        int chosen = bags[0] + jimmysMarbles(shortened, newLimit);
        // assuming first bag was not chosen:
        int notChosen = jimmysMarbles(shortened, limit); // keep same limit as no marbles were added
        
        if (chosen <= limit && chosen > notChosen) // because of the limit difference between chosen and notChosen, chosen could potentially be smaller than notChosen
        {
            return chosen;
        }
        return notChosen;
        
    }
}
