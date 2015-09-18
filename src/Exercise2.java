
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
        Scanner input = new Scanner(System.in);
        System.out.println(MarblesLost2(50,{12,14, 18, 33, 34});
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return ((n % 10) + sumDigits(n / 10));
        }
    }

    public static int triangle(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return (n + triangle(n - 1));
        }
    }

    public static String binaryConvert(int n) {
        if (n / 2 == 0) {
            return "1";
        } else {
            if (n % 2 == 0) {
                return binaryConvert(n / 2) + "0";
            } else {
                return binaryConvert(n / 2) + "1";
            }
        }
    }

    public static boolean isPalindrome(String s, int length) {
        if (length <= 1) {
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome((s.substring(1, s.length() - 1)), length - 2);
            } else {
                return false;
            }
        }
    }

    public static String convert(int n, int b) {
        if (n / b <= 0) {
            return "" + n % b;
        } else {
            if (n % b < 10) {
                return "" + convert(n / b, b) + (n % b);
            } else {
                return convert(n / b, b) + Integer.toHexString(n % b).toUpperCase();
            }
        }
    }

    public static int marblesLost(int max, int[] bags) {
        int bagNumber = 0;
        int count = 0;
        if (bags.length == 1 && bags[0] <= max && bags[0] >= count) {
            return bags[0];
        } else {
            if (count <= max && bagNumber < bags.length) {
            }
        }
        return 0;
    }

    public static int marblesLost2(int max, int[] bags) {
        if (bags.length == 0) {
            return 0;
        } else {
            int[] shortened = Arrays.copyOfRange(bags, 1, bags.length);
            int num1 = bags[0] + marblesLost2(max, shortened);
            int num2 = marblesLost2(max, shortened);
            
            if(num1 > num2 && num1 <= max){
                if(num1+ num2 <= max){
                    return num1+num2;
                }
            }
            else{
              return num2;
            }
        }
        return 0;
    }
}
