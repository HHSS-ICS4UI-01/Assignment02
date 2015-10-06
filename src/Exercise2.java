
import java.util.Arrays;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author haidj9901
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(convert(10, 15));
    }

    //this method returns the sum of the digits of a given number
    public static int sumDigits(int n) {
        if (String.valueOf(n).length() == 1) { //number has been reduced to one single digit
            return n; // return the digit
        }
        return (n % 10 + sumDigits(n / 10)); //call the method with one digit removed from the number (and add the result)
    }

    //this method returns the number of blocks in a triangle where n = number of rows and n is the number of blocks per row
    public static int triangle(int n) {
        if (n == 1 || n == 0) {
            return n; //return 1 once we've reached the top of the triangle
        }
        return n + triangle(n - 1); //works its way down from the top of the triangle (1) to the bottom (n)
    }

    //this method converts any whole number into binary base 2
    public static String binaryConvert(int n) {
        if (n / 2 == 0) {   //if it cannot be evenly divided
            return "" + (n % 2); //return the remainder
        }
        return "" + binaryConvert(n / 2) + n % 2; //the remainder can only be 1 or 0
    }

    //this method converts any whole number into binary base 0 to 16
    public static String convert(int n, int b) {
        if (n < b) { //if the remainder is less than the base
            return "" + Integer.toHexString(n % b).toUpperCase();
        }
        return "" + convert(n / b, b) + Integer.toHexString(n % b).toUpperCase(); //recursively call back to the method 
    }

    //this method checks if a word read forwards is the same read backwards
    public static boolean isPalindrome(String s, int length) {
        if (length == 0 || length == 1) {
            return true;   //if every case has passed the test, it must be a palindrome
        }
        if (s.charAt(0) == s.charAt(s.length() - 1) && isPalindrome(s.substring(1, length - 1), length - 2)) { //check if the first letter is the same as the last
            //check with the first and last letters removed
            return true;
        }
        return false; //if none of the test cases pass, it is not a palindrome.
    }

    //addresses Jimmy's Lost His Marbles problem
    public static int jimmyMarbles(int max, int[] marbleBags) {
        if (marbleBags.length == 0) {
            return 0;
        }
        int[] firstShort = Arrays.copyOfRange(marbleBags, 1, marbleBags.length); //creating an array with the first number missing
        int firstOption = jimmyMarbles(max - marbleBags[0], firstShort) + marbleBags[0]; //first case: including the first number
        int secondOption = jimmyMarbles(max, firstShort); //second case: not including the first number

        //take the best choice out of the two cases
        if (firstOption > secondOption && firstOption <= max) {
            return firstOption;
        }
        return secondOption;
    }
}
