/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author thomt9963
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Input a number");
        int n = input.nextInt();
        System.out.println("sumDigits(" + n + ") = " + sumDigits(n));



        System.out.println("Input the amount of rows in the triangle.");
        n = input.nextInt();
        System.out.println("triangle(" + n + ") = " + triangle(n));

        System.out.println("Input a number to convert to Binary");
        n = input.nextInt();
        System.out.println(n + " in binary = " + binaryConvert(n));
        

        System.out.println("enter a number to convert");
        n = input.nextInt();
        System.out.println("enter in a number in the range of 2-16 to convert the number");
        int l = input.nextInt();
        System.out.println(convert(n, l));

        System.out.println("enter a word to see if it is a palindrome");
        input.nextLine();
        System.out.println(isPalindrome(input.nextLine()));

        System.out.println("How many bags of marbles?");
        n = input.nextInt();
        System.out.println("Enter the maximum amount of marbles that can fit in the box.");
        int maxMarb = input.nextInt();
        int[] marbles = new int[n];
        System.out.println("Enter how many marbles are in the  " + n + " bags from largest to smallest");

        for (int i = 0; i < n; i++) {
            marbles[i] = input.nextInt();
        }
        System.out.println(marbles(marbles, maxMarb));

    }

    static int sumDigits(int n) {
        if (n < 10 && n > 0) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }

    static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return triangle(n - 1) + n;
        }
    }

    static String binaryConvert(int n) {
        if (n <= 1 && n >= 0) {
            return n + "";
        }
        return binaryConvert(n / 2) + n % 2;
    }

    static String Let(int n, int l) {
        if (n >= 0 && n <= 9) {
            return "" + n;

        } else if (l > 10 && n == 10) {
            return "A";
        } else if (l > 10 && n == 11) {
            return "B";
        } else if (l > 10 && n == 12) {
            return "C";
        } else if (l > 10 && n == 13) {
            return "D";
        } else if (l > 10 && n == 14) {
            return "E";
        } else if (l > 10 && n == 15) {
            return "F";
        }
        return "";
    }

    static String convert(int n, int l) {
        if (n >= 0 && n < 9) {
            return "" + n;
        } else if (l > 10 && n == 10) {
            return "A";
        } else if (l > 10 && n == 11) {
            return "B";
        } else if (l > 10 && n == 12) {
            return "C";
        } else if (l > 10 && n == 13) {
            return "D";
        } else if (l > 10 && n == 14) {
            return "E";
        } else if (l > 10 && n == 15) {
            return "F";
        }
        return convert(n / l, l) + Let(n % l, l);
    }

    static String isPalindrome(String n) {
        if (n.length() == 1 || n.length() == 0) {
            return "true";
        }
        if (n.charAt(0) == n.charAt(n.length() - 1)) {
            return isPalindrome(n.substring(1, n.length() - 1));
        } else {
            return "false";
        }

    }

    static int marbles(int[] bags, int max) {
        if (bags.length == 0) {
            return 0;
        }
        int[] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];
        for (int i = 0; i < leftOvers.length; i++) {
            leftOvers[i] = bags[i + 1];
        }
        int with = aBag + marbles(leftOvers, max - aBag);
        int withOut = marbles(leftOvers, max);
        if (with > withOut && with <= max) {
            return with;
        } else if (withOut <= max) {
            return withOut;
        } else {
            return 0;
        }

    }
}
