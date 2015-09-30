
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
         //return the number 
         //and as well return 
         return num + triangle(num-1);
     }
    }
    //problem 3
    public static String binaryConvert(int num )
    {
     if(num==0)
     {
        
         return "0";
     }if(num==1)
     {
         return "1";
     }
     if(num%2==1)
     {     
        return (binaryConvert(num/2) + "1"); 
     }else
     {         
      return (binaryConvert(num/2) + "0");
     }
    }

    //problem 4
    public static String Convert(int num,int b)
    {
      String e = "";  
      int f = num%b;
       if(num<=b)
     {
        
         return "" + num ; 
     }
       
     else
     {         

         if ( f == 10){
              e = "A";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 11)
         {
             e = "B";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 12)
         {
             e = "C";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 13)
         {
             e = "D";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 14)
         {
             e = "E";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 15)
         {
             e = "F";
             return (Convert(num/b,b)) + e;
         }
         else if (f == 16)
         {
             e = "G";
             return (Convert(num/b,b)) + e;
         }
         return  (Convert(num/b,b) + f);
    

         }      
    } 
    
    
    public static boolean isPalindrome(String s)
    {
        int l = s.length();
            if(s.length() <= 1){
                return true;
            }
            if(s.charAt(0) == s.charAt(s.length() -1))
            {
                return isPalindrome(s.substring(1, s.length()-1));
            }else
            {
                return false;
            }
    }
    
    public int marbles(int[] bags, int max)
    {
        
        if(bags.length == 0)
        {
            return 0;
        }
        
        int[] leftOvers = new int[bags.length - 1];
        
        int aBag = bags[0];
        
        for (int i = 0; i < leftOvers.length; i++) {
            leftOvers[i] = bags[i+1];
        }
        
        int with = aBag + marbles(leftOvers,max - aBag);
        int without = marbles(leftOvers, max);
        
        if(with>without && with <= max)
        {
            return with;
        }else if(without <= max)
        {
            return without;
        }else
        {
         return 0;   
        }
        
    }
    
}
