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
        String binNum = binaryConvert(64);
        System.out.println(binNum);
        
        //problem 4 output
        String baseNum = convert(1000, 16);
        System.out.println(baseNum);
        
        //problem 5 output
        boolean palindrome = isPalindrome("racecar", 7);
        System.out.println(palindrome);
        
        //problem 6 output
        int[] nums = {12,14,18,33,34};
        int max = marbles(50, nums);
        //System.out.println(max);
        
    }
    
    //problem 1
    static int sumDigits(int n){
        //if number is less than 9
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
        //if number is less than or equal to 1
        if(n <= 1)
        {
            //return the number to the user
            return n;
            //if number is greater than 1
        }else
        {
            //return the sum of the number + the number subtract 1
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
            return binaryConvert(n / 2) + n%2;    
        }     
            
            
    }
    
    //problem 4
    static String convert(int n, int b){
        
        //if number is less than or equal to 1
        if (n <= 1)
        {
            //return the number as a string
            return String.valueOf(n);
        }
        
        //if number is greater than 9
        else if (n % b > 9){
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
    static int marbles(int n, int[] m){
        //set counter i to 0
        int i = 0;
        
        int mTotal = 0;
        
        
        
        //if total marbles in the two bags is greater than the number the drawer can hold
        if(m[i] + m[i+1] >= n)
        {
            //return the total number of marbles the drawer can hold to the user
            return n;
        //if the drawer cannot hold any marbles    
        }else//(m[i] + m[i+1] < n)
        {//return a zero to the user
            i++;
            return m[i] + m[i+1];
        }
            
//        }else
//        {
//            return i++;
//        }   
    }
}
