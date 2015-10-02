
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author simma1980
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer plz: ");
        int n = in.nextInt();
        System.out.println(sumDigits(n));

        System.out.print("Enter a positive integer plz: ");
        n = in.nextInt();
        System.out.println(triangle(n));

        System.out.print("Enter a positive integer plz: ");
        n = in.nextInt();
        System.out.println(binaryConvert(n));

        System.out.println("Enter a positive integer plz: ");
        int x = in.nextInt();
        System.out.print("Enter a base between 2-16 plz: ");
        int y = in.nextInt();

        System.out.print("Enter the number of bags plz: ");
        n = in.nextInt();
        int[] bags = new int[n];
        System.out.print("Enter the max num of marbles plz: ");
        int max = in.nextInt();
        System.out.print("Enter num of sorted marbles plz: ");
        for (int i = 0; i < bags.length; i++) {
            bags[i] = in.nextInt();
        }
        System.out.println(marbles(bags, max));
    }

    static int sumDigits(int n) {
        if (n < 10 && n >= 0) {
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
        if (n == 1 || n == 0) {
            return "" + n;
        } else {
          return binaryConvert(n/2) + n % 2;  
        }
    }

    static String convert(String n, String b) {
        return null;
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
        int without = marbles(leftOvers, max);
        if (with > without && with <= max) {
            return with;
        } else if (without <= max) {
            return without;
        } else {
            return 0;
        }
    }
}
