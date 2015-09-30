
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinse0649
 */
public class Exercise2 {

   
            //Problem 1 
     static int sumDigits(int n){
         if(n<10){
             return n;
         }
         else{
             return n%10+sumDigits(n/10);
         }
     }
             
     
     
     
     //Problem 2
          static int triangle(int n)
   {
       if (n == 0||n == 1)
       {
           return n;
       }
      
       else 
       {
           return (n) + triangle(n-1);
       }  
   }   
             
       //Problem 3
          static String binaryConvert(int n)
          {

              if (n == 0 || n == 1)
              {
                  return "" + n;
              }
              
              else
              {
                  int remainder = n%2;
                   return binaryConvert(n/2) + remainder;
              }   
          }
             
          
          
          //Problem 4
          static String convert(int n, int b)
          {
              if (n == 0 || n == 1)
              {
                  return "";
              }
              
              if (b>16 || b < 2)
              {
                  return "Enter a number between 2 and 16";
              }             
              else
              {
                  int remainder = n%b;
                  if(remainder<10){
                  return convert(n/b,b) + remainder;
                  }
                  else if(remainder==10){
                      return convert(n/b,b) + "A";
                  }
                  else if(remainder==11){
                      return convert(n/b,b) + "B";
                  }
                  else if(remainder==12){
                      return convert(n/b,b) + "C";
                  }
                  else if(remainder==13){
                      return convert(n/b,b) + "D";
                  }
                  else if(remainder==14){
                      return convert(n/b,b) + "E";
                  }
                  else if(remainder==15){
                      return convert(n/b,b) + "F";
                  }
                  else if(remainder==16){
                      return convert(n/b,b) + "G";
                  }
                  else
                  {
                      return convert(n,b);
                  }
              }
          }
          
          
          
          //Problem 5
          static boolean isPalindrome(String s)
          {
              if (s.length() == 0 || s.length() == 1)
              {
                  return true;
              }
             if (s.charAt(0) == s.charAt(s.length()-1))
             {
                 return isPalindrome(s.substring(1,s.length()-1));
             }
             else{
                 return false;
             }
          }
          
          
          
          
          
          
          //Problem 6
          public int marbles(int[] bags, int max)
          {
              if (bags.length == 0)
              {
                  return 0;
              }
              int [] leftovers = new int[bags.length -1];
              int aBag = bags[0];
              
              for (int i = 0; i<leftovers.length;i++)
              {
                  leftovers[i] = bags[i+1];
              }
              
              
              int with = aBag + marbles(leftovers,max-aBag);
              int without = marbles(leftovers,max);
              
              if (with > without && with <= max)
              {
                  return with;
              }
              else if (without <= max)
              {
                  return without;
              } else
              {
                  return 0;
              }
          }
          
          
             
    public static void main(String[] args) {
        //Problem 1
          Scanner input = new Scanner(System.in);
//        System.out.println("Enter the numbers you want added together");
//        int number = input.nextInt();
//        System.out.println(sumDigits(number));
        
        
        //Problem 2
//         Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the number of rows");
//        int rows = input.nextInt();
//        System.out.println(triangle(rows));
//        
        
      
        //Problem 3
//        int number = input.nextInt();
//        System.out.println(binaryConvert(number));
        
          
          //Problem 4
//          int number = input.nextInt();
//          int number2 = input.nextInt();
//          System.out.println(convert(number,number2));
         
       //Problem 5
         //System.out.println(isPalindrome(input.nextLine()));
          
    }
}
