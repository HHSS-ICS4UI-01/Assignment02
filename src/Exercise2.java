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
    
        int sumAns = sumDigits(1354);
        System.out.println(sumAns);
        
        int triAns = triangle(3);
        System.out.println(triAns);
        
        int convertAns = binaryConvert(32);
        System.out.println(convertAns);
        
        //problem 4 output
        
        //problem 5 output
        boolean palindrome = isPalindrome("Racecar", 7);
        System.out.println(palindrome);
    }
    
    //problem 1
    static int sumDigits(int n){
        if(n < 9)
        {
            return n;
        }else 
        {
            return sumDigits(n % 10) + sumDigits(n / 10);
        }
    }
    
    //problem 2
    static int triangle(int n){ 
        if(n <= 1)
        {
            return n;
        }else
        {
            return n + triangle(n - 1);
        }
        
    }
    
    //problem 3
    static int binaryConvert(int n){ 
        
        if(n == 1)
        {
            return 1;
            
        }else if(n == 0){
            
            return 0;
            
        }else
        {
            int curNum = n % 2;
            String num = String.valueOf("");
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
        
        if (length == 1 || length == 0)
        {
            return true;
        }
        return false;
//        if(s.charAt(0) != s.charAt(length - 1))
//        {
//            return false;
//        }
        
    }
    
    //problem 6
    static int marbles(int n, int[] m){
        return 1;
    }
}
