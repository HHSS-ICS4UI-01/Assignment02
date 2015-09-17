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
        int convertAns = binaryConvert(32);
        System.out.println(convertAns);
        
        //problem 4 output
        
        //problem 5 output
        boolean palindrome = isPalindrome("racecar", 7);
        System.out.println(palindrome);
        
        //problem 6 output
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
    static int binaryConvert(int n){         
        //if number is equal to 1
        if(n == 1)
        {
            //return a 1 to the user
            return 1;
        //else if number is equal to 0
        }else if(n == 0)
        {
            //return a 0 to the user
            return 0;
        //if number is greater than 1
        }else
        {
            String r = String.valueOf(n % 2);
            System.out.print(r);
            //return the quotient of the number divided by 2
            return binaryConvert(n / 2);
        }
    }
    
    //problem 4
    static int convert(int n, int b){
        
        if (n <= 1)
        {
            return n;
        }
        return b;
    }
    
    //problem 5
    static boolean isPalindrome(String s, int length){
        
        if (length == 1)
        {
            return true;
        }
        if(length == 0)
        {
            return false;
        }
        else if(s.charAt(0) != s.charAt(length - 1))
        {
            return false;
        }else{
            String check = s.substring(1, length - 2);
            length = length - 2;
            for(int i = 1; i < length; i++)
            {
                if(s.charAt(i) != s.charAt(length))
                {
                    length --;
                    return false;
                    
                }
                else{
                    return true;
                }
            
            }
        }
        
    }
    
    //problem 6
    static int marbles(int n, int[] m){
        return 1;
    }
}
