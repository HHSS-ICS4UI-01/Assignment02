
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author isles3536
 */
public class Exercise2 {
   //Problem 1
    static int sumDigits(int n){
        if(n<10){
            return n;
        }else{
            return n%10 + sumDigits(n/10);
        }
    }
    //Problem 2
    static int triangle(int n){
        if(n ==0 || n==1)
        {
            return n;
        }
        return n + triangle(n-1);
    }
    //Problem 3
     static String binaryConvert(int n){
         if(n==0||n==1){
             return "" + n;
         }else
         {
             int r = n%2;
           return binaryConvert(n/2) + r;
         }
         
     }
     //Problem 4
     static String convert(int n, int b){
         if(n == 0 || n == 1){
             return "";
         }
         if(b < 2 || b > 16){ // if number is not between 2 or 16
             
             return "Please follow the instructions and try again";        
         }

         else
        {
             int r = n%b;
             if(r<10){
             return convert(n/b,b)+r;//for the number to be divied by the base with the remainder added on
             }
             else if(r==10){//the numbers if need be are converted to the letters.
                return convert(n/b,b)+"A"; 
             }
             else if(r==11){
                return convert(n/b,b)+"B"; 
             }
             else if(r==12){
                return convert(n/b,b)+"C"; 
             }
             else if(r==13){
                return convert(n/b,b)+"D"; 
             }
             else if(r==14){
                return convert(n/b,b)+"E"; 
             }
             else if(r==15){
                return convert(n/b,b)+"F"; 
             }
             else if(r==16){
                return convert(n/b,b)+"G"; 
             }
             else{
                 return convert(n,b);
             }
         }
     }
    //Problem 5
     static boolean isPalindrome(String s){
         if(s.length() == 1 || s.length() == 0){
             return true;    
         }if(s.charAt(0) == s.charAt(s.length()-1)){
             return isPalindrome(s.substring(1,s.length()-1)); 
         }else{
             return false;
         }
         
        
         
         
     }
     
     //Problem 6
     public int marble(int[] bags, int max ){
         if(bags.length == 0){
             return 0;
         }
         int[] leftovers = new int[bags.length-1];
         int abag = bags[0];
         for(int i = 0; i<leftovers.length; i++){
             leftovers[i] = bags[i+1];
         }
         
         
         int with = abag + marble(leftovers,max - abag);
         int without = marble(leftovers,max);
         
         if(with > without && with <= max){
             return with;
         }
         else if(without <= max){
             return without;
         }
         else{
             return 0;
         }
     }
        
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          //Problem 1 Output
//        System.out.println("Please enter the digits you would like added together");
//        int num = input.nextInt();
//        System.out.println(sumDigits(num));
//           
//        //Problem 2 Output
//        System.out.println("Please enter how many rows you would like in the triangle");
//        int tri = input.nextInt();
//        System.out.println(triangle(tri));
//        
//        //Problem 3 Output
//        System.out.println("Please enter the number that you would like converted into binary.");
//        int bin = input.nextInt();
//        System.out.println(binaryConvert(bin));
        
        //Problem 4 Output
//        System.out.println("Please enter the number that you would like converted");
//        int num1 = input.nextInt();
//        System.out.println("Please enter the number that you would like to be the base");
//        int num2 = input.nextInt();
//        System.out.println(convert(num1,num2));
          
          //Problem 5 Output
          System.out.println("Enter a word to see if its a palindrome.");
          System.out.println(isPalindrome(input.nextLine()));
         
          
        //Problem 6 Output
       
    }
}

