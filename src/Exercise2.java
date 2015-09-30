
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donet6376
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    //Problem 1
    static int sumDigits(int n)
    {   //if the number is 1 digit long
        if(n >= 0 && n <=9)
        {
            return n; //return that digit
        }else
        {   //remove the last digit from the number
            int q = n / 10; //set the removed digit
            int r = n % 10; //set the remainder
            return r + sumDigits(q); //loop 
        }
    }
    //Problem 2
    static int triangle(int n)
    {
        if(n == 1 || n == 0)
        {
            return n;
        }else
        {
            return n + triangle(n - 1);
        }
    }
    //Problem 3
    static String binaryConvert(int n)
    {
       if(n == 0)
       {
           return "0";
       }if(n == 1)
       {
           return "1";
       }
       if(n % 2 == 0)
       {
           return (binaryConvert(n/2) + "0");
       }
       else
       {
           return (binaryConvert(n/2) + "1");
       }
    }
    //Problem 4
    static String convert(int n, int b)
    {
        if(n<b)
        {
            if(n<10)
            {
                return "" + n;
            }else if(n == 10)
            {
                return "A";
            }else if(n == 11)
            {
                return "B";
            }else if(n == 12)
            {
                return "C";
            }else if(n == 13)
            {
                return "D";
            }else if(n == 14)
            {
                return "E";
            }else 
            {
                return "F";
            }
        }
        if(n % b < 10)
        {
            return convert(n / b, b) + n%b;
        }if(n % b == 10)
        {
            return convert(n / b, b) + "A";
        }if(n % b == 11)
        {
            return convert(n / b, b) + "B";
        }if(n % b == 12)
        {
            return convert(n / b, b) + "C";
        }if(n % b == 13)
        {
            return convert(n / b, b) + "D";
        }if(n % b == 14)
        {
            return convert(n / b, b) + "E";
        }else
        {
            return convert(n / b, b) + "F";
        }
    }
    //Problem 5
    static boolean isPalindrome(String s, int length)
    {
        length = s.length();
        if(s.length() == 0)
        {
            return true;
        }
        if(s.length() == 1)
        {
            return true;
        }
        if(s.charAt(0) == s.charAt(length - 1))
        {
            String temp = s.substring(1, length - 1);
            return isPalindrome(temp, temp.length());
        }else
        {
            return false;
        }
    }
    //Problem 6
    static int marbles(int[] bags, int max)
    {
        if(bags.length == 0)
        {
            return 0;
        }
        int[] leftovers = new int[bags.length - 1];
        int aBag = bags[0];
        for(int i = 0; i < leftovers.length; i++)
        {
            leftovers[i] = bags[i + 1];
        }
        int with = aBag + marbles(leftovers, max - aBag);
        int without = marbles(leftovers, max);
        if(with > without && with <= max)
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
    
    //Main Method For Testing
    public static void main(String[] args) {
        //Remove "//" in all lines other than the title of a Problem to run tests
        Scanner input = new Scanner(System.in);
        //Problem 1
        //System.out.println("Enter in a number to receive it's sum of digits:");
        //int num = input.nextInt();
        //System.out.println("The sum of " + num + "'s digits is " + sumDigits(num));
        
        //Problem 2
        //System.out.println("Enter in the amount of rows:");
        //int num = input.nextInt();
        //System.out.println("The amount of blocks in a triangle with " + num + 
        //" rows is " + triangle(num));
        
        //Problem 3
        //System.out.println("Enter in a number to convert to binary");
        //int num = input.nextInt();
        //System.out.println(num + " in binary is " + binaryConvert(num));
        
        //Problem 4
        //System.out.println("Enter in a number to convert to a set base case");
        //int num = input.nextInt();
        //System.out.println("Enter a number for the base you want the number converted in");
        //int base = input.nextInt();
        //System.out.println(num + " in base " + base + " is " + convert(num,base));
        
        //Problem 5
        //System.out.println("Please enter in a word to check if it is a palindrome");
        //String word = input.nextLine();
        //System.out.println("Is " + word + " a palindrome? " + isPalindrome(word, word.length()));
        
        //Problem 6
        //System.out.println("Input the maximum amount of marbles");
        //int max = input.nextInt();
        //System.out.println("How many bags of marbles are there?");
        //int bags = input.nextInt();
        //System.out.println("Enter in the amount of marbles in each bag on separate lines");
        //int[] marbles = new int[bags];
        //for(int i = 0; i < bags; i++)
        //{
        //    marbles[i] = input.nextInt();
        //}
        //System.out.println("The maximum number of marbles that can fit inside the box is "
        //+ marbles(marbles, max));
    }
}
