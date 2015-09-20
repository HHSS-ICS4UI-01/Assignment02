
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
    static int[] test = {12, 22, 18, 67, 23, 50};

    public static void main(String[] args) {
        System.out.println(jimmyMarbles(100, test));
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
        if (n <= b) { //if the remainder is less than the base
            return "" + n; 
        }
        
        //this next block of code accounts for when there is a two digit remainder
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
        } 
        //return binary normally if the remainder is less than 10
        else {
            return "" + convert(n / b, b) + n % b;
        }

    }

    //this method checks 
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
        if (marbleBags.length == 0) {
            return 0;
        }
        int[] firstShort = Arrays.copyOfRange(marbleBags, 1, marbleBags.length);
        int firstOption = jimmyMarbles(max - marbleBags[0], firstShort) + marbleBags[0];
        int secondOption = jimmyMarbles(max, firstShort);

        if (firstOption > secondOption && firstOption <= max) {
            return firstOption;
        }
        return secondOption;
    }

    public static int jimmyMarblesImSoSorryThisExists(int max, int[] marbleBags) {
        if (marbleBags.length == 0) {
            return 0;
        }
        int[] firstShort = Arrays.copyOfRange(marbleBags, 1, marbleBags.length);
        int[] lastShort = Arrays.copyOfRange(marbleBags, 0, marbleBags.length - 1);
        int firstOption = marbleBags[marbleBags.length - 1] + jimmyMarbles(max, lastShort);
        int secondOption = jimmyMarbles(max, lastShort);
        int thirdOption = marbleBags[0] + jimmyMarbles(max, firstShort);
        int fourthOption = jimmyMarbles(max, firstShort);

        int answer = 0;
        if (firstOption > secondOption && firstOption <= max) {
            answer = firstOption;
        } else if (secondOption <= max) {
            answer = secondOption;
        }
        if (thirdOption > fourthOption && thirdOption <= max && thirdOption > answer) {
            answer = thirdOption;
        } else if (fourthOption <= max && fourthOption > answer) {
            answer = fourthOption;
        }
        return answer;
    }

    public static int jimmyMarblesTerrible(int max, int[] marbleBags) {
        if (marbleBags.length == 0) {
            return 0;
        }
        int[] lastShort = Arrays.copyOfRange(marbleBags, 0, marbleBags.length - 1);
        int firstOption = marbleBags[marbleBags.length - 1] + jimmyMarbles(max, lastShort);
        int secondOption = jimmyMarbles(max, lastShort);

        int answer = 0;
        if (firstOption > secondOption && firstOption <= max) {
            answer = firstOption;
        }
        answer = secondOption;
        return answer;
    }

    public static int jimmyMarblesAwful(int max, int[] marbleBags) {
        int sum = 0;
        for (Integer i : marbleBags) {
            sum += i;
        }
        if (max == 0) {
            return 0;
        } else if (sum <= max) {
            return sum;
        }
        return 0;
    }

    public static int jimmyMarblesLessBad(int max, int[] marbleBags) {
        int test = 0;
        if (max <= 0 || marbleBags.length == 0) {
            return 0;
        } else if (max > marbleBags[0] && marbleBags.length != 1) {
            test = jimmyMarbles(max - marbleBags[0], Arrays.copyOfRange(marbleBags, 1, marbleBags.length));
            System.out.println(test);
        }
        //return 1;
        return jimmyMarbles(test, marbleBags);
    }

    public static int jimmyMarblesBad(int max, int[] marbleBags) {
        int z = 0;
        if (marbleBags.length <= 1) {
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

    //5 planets, can only visit 3
    public static int numPlanets(int n, int k) {
        if (k == 0 || n == k) {
            return 1;
        } else if (k > n) {
            return 0;
        }
        return numPlanets(n - 1, k - 1) + numPlanets(n - 1, k);
    }
}
