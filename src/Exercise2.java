/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //problem 1 output
        int sumAns = sumDigits(10);
        System.out.println(sumAns);
        
        //problem 2 output
        int triAns = triangle(3);
        System.out.println(triAns);
        
        //problem 3 output
        String binConvert = binaryConvert(64);
        System.out.println(binConvert);
        
        //problem 4 output
        String numConvert = convert(1000, 16);
        System.out.println(numConvert);
        
        //problem 5 output
        boolean palindrome = isPalindrome("racecar", 7);
        System.out.println(palindrome);
        
        //problem 6 output
        int[] bags = {12,18,22,67,50,23};
        int maxMarbles = marbles(100, bags);
        System.out.println(maxMarbles);
        
    }
    
    //problem 1
    static int sumDigits(int n){
        //if number entered is less than 9
        if(n <= 9)
        {
            //return the number to the user
            return n;
        //if number is greater than 9
        }else 
        {
            //return the sum of the numbers
            //by calculating the sum of the number's quotient when divided by 10
            //and the remainder of the number when divided by 10
            return sumDigits(n % 10) + sumDigits(n / 10);
        }
    }
    
    //problem 2
    static int triangle(int n){ 
        //if number of rows is less than or equal to 1
        if(n <= 1)
        {
            //return the number to the user
            return n;
            
        }
        //if number of rows is greater than 1
        else
        {
            //return the sum of the number plus the number subtract 1
            return n + triangle(n - 1);
        }
       
    }
    
    //problem 3
    static String binaryConvert(int n){ 
        
        //if number is equal to 1
        if(n == 1)
        {
            //return a 1 to the user
            return "1";
            
        //else if number is equal to 0
        }else if(n == 0)
        {
            //return a 0 to the user
            return "0";
        //if number is greater than 1
        }else
        {      
            //return the quotient of the number divided by 2
            //and the remainder of the number divided by 2
            return binaryConvert(n / 2) + n%2;    
        }     
            
            
    }
    
    //problem 4
    static String convert(int n, int b){
        
        //if number is less than the base case and less than 10
        if (n < b && n < 10)
        {
            //return the number as a string
            return String.valueOf(n);
        }
        
        //if remainder of number is greater than 9
            else if(n % b > 9){
            //convert to hexadecimal
            
            //convert 10 to A
            if(n%b == 10)
            {
                return convert(n / b, b) + "A";
            }
            //convert 11 to B
            if(n%b == 11)
            {
                return convert(n / b, b) + "B";
            }
            //convert 12 to C
            if(n%b == 12)
            {
                return convert(n / b, b) + "C";
            }
            //convert 13 to D
            if(n%b == 13)
            {
                return convert(n / b, b) + "D";
            }
            //convert 14 to E
            if(n%b == 14)
            {
                return convert(n / b, b) + "E";
            }
            //convert 15 to F
            if(n%b == 15)
            {
                return convert(n / b, b) + "F";
            }     
        
        }
        //return the quotient of n / b and the remainder of n / b as a string
        return convert(n / b, b) + n%b;
    }
    
    //problem 5
    static boolean isPalindrome(String s, int length){
        //if string length is 0 or 1
        if (length == 1 || length == 0)
        {
            //return true to the user
            return true;
        }
        //if the first letter of the string is equal to the last letter of the string
        if(s.charAt(0) == s.charAt(length - 1))
        {
            //return a substring excluding the two letters compared
            return isPalindrome(s.substring(1, length - 1), length - 2);
            
        }
        //if the first letter and last letter are not equal
        else{
            //return false to the user
            return false;
            }    
    }
    
    //problem 6
    static int marbles(int max, int[] bags){
        
        //if there are no bags of marbles
        if(bags.length == 0){
            //return a 0 to the user
            return 0;
        }
        //creates an array for all bags but one
        int[] leftovers = new int[bags.length - 1];
        
        //assigns the first bag to a variable
        int aBag = bags[0];
        
        //assign each bag except for the first bag to leftovers
        for(int i = 0; i < leftovers.length; i++)
        {
            leftovers[i] = bags[i + 1];
        }
        
        //count the total number of marbles including the first bag
        int with = aBag + marbles(max - aBag, leftovers);
        //count the total number of marbles excluding the first bag
        int without = marbles(max, leftovers);
        
        //if there are more marbles including the first bag than without it
        //and if the total marble count is less than the max capacity
        if(with > without && with <= max){
            //return total number of marbles including the first bag to the user
            return with;
            //if there are more marbles excluding the first bag than with it
            //and if the total marble count is less than the max capacity
        }else if(without <= max){
            //return total number of marbles excluding the first bag to the user
            return without;
            //if both marble totals are greater than the max capacity
        }else{
            //return a 0 to the user
            return 0;
        }
            
    }
}
