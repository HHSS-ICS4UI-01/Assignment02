
import java.lang.reflect.Array;
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
    static int[] test = {0,4};

    public static void main(String[] args) {
        System.out.println(jimmyMarbles(50, test));
    }

    public static int sumDigits(int n) {
        if (String.valueOf(n).length() == 1) {
            return n;
        }
        return (n % 10 + sumDigits(n / 10));
    }

    public static int triangle(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n + triangle(n - 1);
    }

    public static String binaryConvert(int n) {
        if (n / 2 == 0) {
            return String.valueOf(n % 2);
        }
        return "" + binaryConvert(n / 2) + n % 2;
    }

    public static String convert(int n, int b) {
        if (n <= b) {
            return "" + n;
        }
        if (n == 10) {
            return convert(n / b, b) + "A";
        } else if (n % b == 11) {
            return convert(n / b, b) + "B";
        } else if (n % b == 12) {
            return convert(n / b, b) + "C";
        } else if (n % b == 13) {
            return convert(n / b, b) + "D";
        } else if (n % b == 14) {
            return convert(n / b, b) + "E";
        } else if (n % b == 15) {
            return convert(n / b, b) + "F";
        } else {
            return "" + convert(n / b, b) + n % b;
        }

    }

    public static boolean isPalindrome(String s, int length) {
        if (length == 0 || length == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (isPalindrome(s.substring(1, length - 1), length - 2)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int jimmyMarbles(int max, int[] marbleBags) {
        int z = 0;
        if (marbleBags.length <= 1)
        {
            return marbleBags[0];
        }
        for (int x = 0; x < marbleBags.length; x++) {
            for (int y = 0; y < marbleBags.length; y++) {
                if (marbleBags[x] <= max && marbleBags[y] <= max) {
                    if (marbleBags[x] + marbleBags[y] <= max) {
                        if (marbleBags[x] + marbleBags[y] > z) {
                            z = marbleBags[x] + marbleBags[y];
                        }
                    }
                }
            }
        }
        return z;
    }

    public static int numPlanets(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else if (k > n) {
            return 0;
        }
        return numPlanets(n - 1, k - 1) + numPlanets(n - 1, k);
    }
}
