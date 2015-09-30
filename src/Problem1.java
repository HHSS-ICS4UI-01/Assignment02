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
    }

    static int sumDigits(int n) {
        int leftmost = n / 10;
        //Left digits
        int left = leftmost / 10;
        //Left digit of "leftmost"
        int rightleft = leftmost % 10;
        //Right digit of "leftmost"
        int rightmost = n % 10;
        //Last right digit

        return (left + rightleft + rightmost);

    }

    static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return triangle(n - 1) + n;
        }
    }
    
    static int binaryConvert(int n){
        
        return 0;
        
    }
}
