
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rayan4858
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n = input.nextInt();
        
        System.out.println("Enter a word");
        String word = input.nextLine();
        int a = word.length();
        
//        System.out.println("Enter a base between 2-16");
//        int b = input.nextInt();
        
        System.out.println(isPalindrome(word));


    }

    static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangle(n - 1);
        }
    }

    static String binaryConvert(int n) {
        int q = 0;
        int r = 0;

        if (n == 1) {
            return "1";
        } else {
            r = n % 2;
            q = n / 2;
            return binaryConvert(q) + r;
        }
    }

    static String convert(int n, int b) {
       int q = 0;
       int r = 0;
       String let = "";
       if(n <= b)
       {
           return "" + n;
       }else
       r = n%b;
       q = n/b;
       if(r == 10)
       {
           let = "A";
           return convert(q,b) + let;
       }else if (r == 11){
           let = "B";
           return convert(q,b) + let;
       }else if (r == 12){
           let = "C";
           return convert(q,b) + let;
       }else if (r == 13){
           let = "D";
           return convert(q,b) + let;
       }else if (r == 14){
           let = "E";
           return convert(q,b) + let;
       }else if (r == 15){
           let = "F";
           return convert(q,b) + let + r;
       }else    return convert(q,b) + r;
           
       }
    
        static boolean isPalindrome(String s){
           
            
            if (s.length() <= 1) {
                
               return true;
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(1,s.length()-1));
            }else{
                return false;
            }
            
            
            
            
                   
        }
        
        public int marbles(int[] bags, int max){
            if (bags.length == 0) {
                return 0;
            }
            
            int[] leftovers = new int[bags.length-1];
            int aBag = bags[0];
            

            for (int i = 0; i < leftovers.length; i++) {
                leftovers[i] = bags[i+1];
            }
            
            int with = aBag + marbles(leftovers, max -aBag);
            int without = marbles(leftovers,max);
            
            if (with > without && with <= max) {
                return with;
            }else if (without <= max) {
                return without;
            }else{
                return 0;
            }
                  
            
            
            
            
            
            
            
        }
    
    
   
    }

    

