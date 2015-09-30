
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vonhn0812
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    }

    public static int sumDigits(int n) {

        if (n < 10) {                               //if the number is less than 10, return the number
            return n;                               
        } else {
             return n % 10 + sumDigits(n / 10);     //return the firt digit plus the sumDigits(number without the first digit) 
            
        }

    }
    
    public static int triangle(int n){             
      
        if (n==1){                                  //if the number is one return one
            return 1;
        }else{
            return n + triangle(n-1);              //return the number + triangle(next layer)
        }
        
        
    }
    
    public static String binaryConvert(int n){
      
        if (n == 0) {                               //if the number is 0 return 0
            return "0";
        }
        if (n == 1) {                               //if the number is 1 return 1
            return "1";
        }
        if (n % 2 == 0) {                           //if the number can be evenly divided by two
            return (binaryConvert(n / 2) + "0");    //return the number divided by two plus 0

        } else {
            return (binaryConvert(n / 2) + "1");    //return the number divided by two plus 1
        }


    }

    public static String Convert(int n, int b) {    // input number and base
        if (n <= b) {                               // if the number is less than or equal to the base return the number
            return "" + n;  
        }
        int r = n % b;                              //remainder of the number and base
        String e = "";                              // string to store letter if needed
        if (r == 0) {                               //if the number is divided evenly by the base, return 0 and the method with the number divided by the base
            return (Convert(n / b, b) + "" + 0);
        } else {
            if (r > 9) {                            //if the remainder is larger than 9, use a letter to represent it
                if (r == 10) {
                    e = "A";
                }
                if (r == 11) {
                    e = "B";
                }
                if (r == 12) {
                    e = "C";
                }
                if (r == 13) {
                    e = "D";
                }
                if (r == 14) {
                    e = "E";
                }
                if (r == 15) {
                    e = "F";
                }

                
            } else {                                    //the number isnt divided evenly
                e = "" + r;                             //if the number is less than 10, e = the number
            }


            return (Convert(n / b, b) + e);             //return the number
        }



    }
    public static boolean isPalindrome(String n){       
      int length = n.length();                          //length variable
        if(length==1){                                  //if there is only one letter the letter is a palindrome
           return true;
       }
        if(length==2&&n.charAt(0)==n.charAt(1)){        //if there are 2 letters and they are the same the word is a palindrome
           return true;
        }
       if(n.charAt(0)==n.charAt(length-1)){             //if the first and last letter are the same
       String x = n.substring(1, length-1);             //remove the first and last letter
           
       
       return isPalindrome(x);                          //return palindrome(the new word)
         } else {
       
        return false;                                   //if they are not the same return false.
       }
       
    }
    
    public static int marbles(int max, int[] bags){
        if(bags.length == 0){
            return 0;
        }
        int [] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];
        
        for (int i = 0; i < leftOvers.length; i++) {
         leftOvers[i] = bags[i+1];
        }
        
        int with = aBag+marbles(max-aBag,leftOvers);
        int without = marbles(max,leftOvers);
        
        if(with>without && with<=max){
            return with;
        }else if(without<=max){
            return without;
        
    }else{
            return 0;
        }
    
    }
    
    
    
    
    










}




