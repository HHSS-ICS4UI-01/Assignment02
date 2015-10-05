
import java.util.Scanner;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       String word = "hannah";
         System.out.println(isPalindrome(word));
        
    }
    //problem 1
    public static int sumDigits(int num)
    {
        //if the number is less than 10
        if (num<10)
        {
            // return the number
            return num;
        }else
        {
            //store the number in the ones column
            //return the number divided by 10
            //add all the stored ones columns
            
            return num%10 + sumDigits(num/10);
        }
    }
    
    //problem 2
    public static int triangle(int num)
    {
     //if the number equals 0   
     if(num==0)
     {
         //return 0
         return 0;
     }
     //if the number equals 1
     if(num==1)
     {
         //return 1
         return 1;
     }else{
         //return the number inputed + 1 less than the number
         return num + triangle(num-1);
     }
    }
    
    
    //problem 3
    public static String binaryConvert(int num )
    {
        //if the number is 0 
     if(num==0)
     {
        //return 0
         return "0";
     }
     //if the number is 1 
     if(num==1)
     {
         //return 1
         return "1";
     }
     //if the number divided by 2 has a remainder of 1 return 1
     if(num%2==1)
     {     
        return (binaryConvert(num/2) + "1"); 
     }else
     {
         //or if it has a remainder of 0 return 0
      return (binaryConvert(num/2) + "0");
     }
    }

    //problem 4
    public static String Convert(int num,int b)
    {
        //make a blank string to store letters later on
      String e = "";  
      // int f represents the remainder of the number divided by the base
      int f = num%b;
      //if the number is less than or equal to the base
       if(num<=b)
     {
        //return the number inputed
         return "" + num ; 
     }
       
     else
     {         
         //if the remaider is 10
         if ( f == 10){
             //the string becomes A
              e = "A";
              //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add A to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 11
         else if (f == 11)
         {
             //the string becomes B
             e = "B";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add B to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 12
         else if (f == 12)
         {
             //the string becomes C
             e = "C";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add C to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 13
         else if (f == 13)
         {
             //the string becomes D
             e = "D";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add D to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 14
         else if (f == 14)
         {
             //the string becomes E
             e = "E";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add E to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 15
         else if (f == 15)
         {
             //the string becomes F
             e = "F";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add F to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //if the remaider is 16
         else if (f == 16)
         {
             //the string becomes G
             e = "G";
             //repeat the method
              //return the number divided by the base as the first variable
              //return the base as the second variable
              //add G to the outputed number
             return (Convert(num/b,b)) + e;
         }
         //return the number plus the remainder of the number divided by the base
         return  (Convert(num/b,b) + f);
    

         }      
    } 
    
    
    public static boolean isPalindrome(String s)
    {
            //if the length of the word is 1 or less than 1
            if(s.length() <= 1){
                return true;
            }
            //if the first letter is the same as the last letter
            if(s.charAt(0) == s.charAt(s.length() -1))
            {
                //remove the first and the last letters of the word and go through the process again
                return isPalindrome(s.substring(1, s.length()-1));
            }else
            {
                //if the first letter and the last letter arent the same return false
                return false;
            }
    }
    
    public int marbles(int[] bags, int max)
    {
      //if there is no bags  
        if(bags.length == 0)
        {
            return 0;
        }
        //make an integer of left overs to represent the bags that still have to be used
        int[] leftOvers = new int[bags.length - 1];
        
        //make an integer for the first bag
        int aBag = bags[0];
        
        
        for (int i = 0; i < leftOvers.length; i++) {
            //left overs equals the next bag in the array
            leftOvers[i] = bags[i+1];
        }
        //stores the first bag and goes through the method again
        int with = aBag + marbles(leftOvers,max - aBag);
        //disregard the first bag and go through the array again
        int without = marbles(leftOvers, max);
        
        
        if(with>without && with <= max)
        {
            return with;
        }else if(without <= max)
        {
            return without;
        }else
        {
            //if without is greater than max
            //or with is greater than max
         return 0;   
        }
        
    }
    
}
