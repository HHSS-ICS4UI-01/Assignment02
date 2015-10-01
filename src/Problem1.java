
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author murra9546
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Problem1 test = new Problem1();
        System.out.println(test.sumDigits(12));
    }

    //problem 1
    static int sumDigits(int n) {
        //if the inputted number is less than 10, return the number
        if (n < 10) {
            return n;
        } else {
            //mod the number and add the mod to the next single number 
            return n % 10 + sumDigits(n / 10);
        }
    }

    //problem 2
    static int triangle(int n) {
        //if they want the first one,e it will always be 1
        if (n == 1) {
            return n;
        }else{
         //add the number at the base, then add the amount of blocks on the next level    
            return n + triangle(n - 1);
        }
    }

    //problem 3    
    static String binaryConvert(int n) {
        //declare quotient and remainder variables
        int q = 0;
        int r = 0;
        
        //if the inputted number is 1, return 1
        if (n == 1) {
            return "1";
        }else{
            //store mod 2 of the number in variable r
            r = n % 2;
            //divide the number by 2
            q = n / 2;
            //add the remainders
            return binaryConvert(q) + r;
        }

    }

    //problem 4
    static String convert(int n, int b) {
        //declare quotient and remainder variables and string
        int q = 0;
        int r = 0;
        String let = "";
        //if the number is less than or equal to the base, return the inputted number
        if (n <= b) {
            return "" + n;
        }else{
            //the number modded by the base is stored in variable r
            r = n % b;
        }
        //divide the number by the base to find the quotiend
        q = n / b;
        if (r == 10) { //if the remainder is equal to 10, replace the number 10 with "A" and recall to mod the next number
            let = "A";
            return convert(q, b) + let;
        } else if (r == 11) {//if the remainder is equal to 11, replace the number 11 with "B" and recall to mod the next number
            let = "B";
            return convert(q, b) + let;
        } else if (r == 12) {//if the remainder is equal to 12, replace the number 12 with "C" and recall to mod the next number
            let = "C";
            return convert(q, b) + let;
        } else if (r == 13) {//if the remainder is equal to 13, replace the number 13 with "D" and recall to mod the next number
            let = "D";
            return convert(q, b) + let;
        } else if (r == 14) {//if the remainder is equal to 14, replace the number 14 with "E" and recall to mod the next number
            let = "E";
            return convert(q, b) + let;
        } else if (r == 15) {//if the remainder is equal to 15, replace the number 15 with "F" and recall to mod the next number
            let = "F";
            return convert(q, b) + let + r;
        } else {//return the remainder plus the remainder of the next number
            return convert(q, b) + r;
        }
    }
    
    
    
    //problem 5
    static boolean isPalindrome(String s) {
        //if it is one letter long, it is a palindrome
        if(s.length() == 1){
            return true;
        }
        //if the first letter and the last letter are the same, chop off the first and last letters and check if they are the same
        if(s.charAt(0) == s.charAt(s.length()-1))
        {
           return isPalindrome(s.substring(1,s.length() -1));         
        }else{
            //it is not a palindrome
            return false;
        }
    }
    
    
    //problem 6
    public int marbles(int[] bags, int max){
        //if the number of bags is 0, return 0
        if(bags.length == 0)
        {
            return 0;
        }
        //declare leftovers and aBag
        int[] leftovers = new int[bags.length-1];
        int aBag= bags[0];
        //go through every spot of the array and make it equal to the array bags in the following spot
        for(int i = 0; i < leftovers.length;i++)
        {
            leftovers[i] = bags[i+1];
        }
        //if that bag is used
        int with = aBag + marbles(leftovers,max-aBag);
        //if bag is not used
        int without = marbles(leftovers,max);
        //if the number of bags used is greater than that of without and is less than or equal to the max number needed, return with
        if(with > without && with <= max)
        {
             return with;
        }else if(without <= max) //if not used number is less than or equal to the max, return without
        {
            return without;
        }else{ //return 0 
            return 0;
        }
    }
}
