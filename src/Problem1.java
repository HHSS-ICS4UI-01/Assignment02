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
        
        System.out.println("");
        n = input.nextInt();
       int b = input.nextInt();
        System.out.println("");
        
        System.out.println("");
        String s = input.nextLine();
        
        System.out.println("");
        n = input.nextInt();
        int f = input.nextInt();




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
        if (n <=1 && n >=0) {
            return n + "";
        }
        return binaryConvert(n / 2) + n % 2;
    }
    
    static int convert(int n, int b){
        return 0;
        
    }
    
    static String isPalindrome(String s, int length){
        return null;
        
    }
    
    static int marblesInBox(int n, int f[] ){
        return 0;
        
    }
}
