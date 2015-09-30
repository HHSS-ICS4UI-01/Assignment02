
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author branc2347
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //'ello
    }
    //find the sum of the digits in a number

    public static int sumDigits(int n) {
        if (n < 10) { // if the number is less than 10, just return the number
            return n;
        } else {
            return ((n % 10) + sumDigits(n / 10)); // add the last digit to the new number without the last digit
        }
    }
    //find the number of blocks in a triangle made of rows of blocks 

    public static int triangle(int n) {
        if (n == 0 || n == 1) { // if there are 0 or 1 rows
            return n;
        } else {
            return (n + triangle(n - 1)); // add the number of blocks at the topmost row(n) + return the number of the (n-1) row
        }
    }
    //converts numbers into binary (base 2)

    public static String binaryConvert(int n) {
        if (n / 2 == 0) { // if the number is equal to 1 
            return "" + n % 2; // return the remainder (divides into '1' 0 times + a remainder of 1
        } else {
            return binaryConvert(n / 2) + n % 2; // return the remainder of that number in base 2 and of the current number/2
        }
    }
    // find if a word spells the same backwards as it does forwards

    public static boolean isPalindrome(String s, int length) {
        if (length <= 1) { //if the word is of one length or no length, it will be spelled the same both backwards and forwards
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) { //check if the letter is at either end of the word
                return isPalindrome((s.substring(1, s.length() - 1)), length - 2); //return the word cut, to compare the next 2 letters
            } else {
                return false;
            }
        }
    }
    //convert any number into any base

    public static String convert(int n, int b) {
        if (n / b <= 0) { // if the number becomes zero in the next( last) division 
            return "" + n % b;
        } else {
            if (n % b < 10) { //if the number %base is less than ten
                return "" + convert(n / b, b) + (n % b); // find the remainder and add it to the remainder of the next (num/b)
            } else {
                return convert(n / b, b) + Integer.toHexString(n % b).toUpperCase(); //same as above, except turn the remainder into a hexadecimal string (10-15)
            }
        }
    }
    //find the amount of marbles you can put in the box

    public static int marblesLost2(int max, int[] bags) {
        if (bags.length == 0) { // if the shortened array length is 0 (or the initial)
            return 0;
        } else {
            int[] shortBags = Arrays.copyOfRange(bags, 1, bags.length); //shorten array to eliminate option
            int num1 = bags[0] + marblesLost2(max - bags[0], shortBags); //possibilities while having bags[0]
            int num2 = marblesLost2(max, shortBags); //posibilities without having bags[0]

            if (num1 > num2 && num1 <= max) { // only return num1 if it is bigger than num2 but smaller than the max
                return num1;
            } else {
                return num2; //else return num2 --- 'greedy algorithm'
            }
        }
    }
}
