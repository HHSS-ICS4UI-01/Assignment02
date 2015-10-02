/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import java.util.Scanner;

/**
 *
 * @author yaol9270
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    
    static int sumDigits(int n){    //problem1
        if(n<10){                   //base case (if n is only 1 digit, return that digit)
            return n;
        }
        else{
                                    //get right digit and cut it off
        
        return sumDigits(n%10)+sumDigits(n/10);
        }
    }
    
    static int triangle(int n){     //problem2
        if(n<=1){
            return n;               //base case (if only 1 layer or less return n)
        }
        else{                       //otherwise return the layer plus the lower layer until it reaches the base case of layer 1
            return triangle(n-1)+n;
        }
    }
    
    static String binaryConvert(int n){     //problem3
        if(n <= 1){                         //base case, if number is smaller or equal to 1, return 1
            return "1";
        }
        else{                               //if the number is not divisible by 2, cut off the right digit and return 1 to add to the string
            if(n%2==1){
                n/=2;
                return binaryConvert(n)+"1";
            }
            else{                           //else if the number is divisible by 2, cut off the right digit and return 0 to add to the string
                n/=2;
                return binaryConvert(n)+"0";
            }
        }
    }
    
    static String Convert(int n, int b){    //problem4
        if(n < b){                          //base case, if number is smaller than the base number, return that number (or letter if it is equal or higher than 10)
            if(n == 10){
                return "A";
            }
            else if(n == 11){
                return "B";
            }
            else if(n == 12){
                return "C";
            }
            else if(n == 13){
                return "D";
            }
            else if(n == 14){
                return "E";
            }
            else if(n == 15){
                return "F";
            }
            else{
            return "" +n;
            }
        }
        else{
            if(n%b==1){                     //if it is not the base case, find the remainder of the number divided by the base, and return that number (or letter) and get rid of the right most digit for the recursion to go through again for the digit second from the right until it reaches the last digit (base case)
                n/=b;
                return Convert(n,b)+"1";
            }
            else if(n%b==0){
                n/=b;
                return Convert(n,b)+"0";
            }
            else if(n%b==2){
                n/=b;
                return Convert(n,b)+"2";
            }else if(n%b==3){
                n/=b;
                return Convert(n,b)+"3";
            }else if(n%b==4){
                n/=b;
                return Convert(n,b)+"4";
            }else if(n%b==5){
                n/=b;
                return Convert(n,b)+"5";
            }else if(n%b==6){
                n/=b;
                return Convert(n,b)+"6";
            }else if(n%b==7){
                n/=b;
                return Convert(n,b)+"7";
            }else if(n%b==8){
                n/=b;
                return Convert(n,b)+"8";
            }else if(n%b==9){
                n/=b;
                return Convert(n,b)+"9";
            }else if(n%b==10){
                n/=b;
                return Convert(n,b)+"A";
            }else if(n%b==11){
                n/=b;
                return Convert(n,b)+"B";
            }else if(n%b==12){
                n/=b;
                return Convert(n,b)+"C";
            }else if(n%b==13){
                n/=b;
                return Convert(n,b)+"D";
            }else if(n%b==14){
                n/=b;
                return Convert(n,b)+"E";
            }else{
                n/=b;
                return Convert(n,b)+"F";
            
            }
        }
        
    }
    
    
    static boolean isPalindrome(String s){                      //problem 5
        int length = s.length();
        if(length<=1){                                          //base case, if equal to or less than 1 letter long, return true
            return true;
        }
        else{
            if(s.charAt(0) == s.charAt(length-1)){              //if the first letter equals the last letter, go to the next letter (the second and second last) and compare them

                return isPalindrome(s.substring(1,length-1));
            }
            else {
                return false;                                   //if at any point in the recursion that the two mirrored letters do not match, it is not a palindrome
            }
        }
        
        
    }
    
    static int Marble(int max, int[] bags){                 //problem 6
        
        if(bags.length == 0){                               //base case, if there are no bags then return 0 marbles
            return 0;
        }
        
        int[] leftOvers = new int[bags.length-1];           //leftovers is the array of bags left unused
        int aBag = bags[0];                                 //the first bag
        
        for(int i = 0; i < leftOvers.length; i++){
            leftOvers[i] = bags[i+1];                       //make the leftovers so that the array of leftovers shifts one position to the right
        }
        
        int with = aBag + Marble(max - aBag,leftOvers);     //if using the bag, use the selected bag(aBag) and add the leftovers with the maximum subtracting aBag (to make the current amount 0 again while decreasing the box size
        int without = Marble(max,leftOvers);                //if not using the bag, keep the box maximum capacity and use the leftovers (without aBag in it)
        
        
        if(with > without && with <= max){                  //compare which solution is better, use that
            return with;
        }
        else if(without <= max){
            return without;
        }
        else{                                               //faulty case
            return 0;
        }
        
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you wish to get the sum of its digits");
        System.out.println("The sum of its digits is " + sumDigits(input.nextInt()));
        
        System.out.println("Enter in the number of layers in the triangle");
        System.out.println("There are " + triangle(input.nextInt()) + " blocks");
        
        System.out.println("Enter in the number you wish to convert into binary");
        System.out.println(binaryConvert(input.nextInt()));
        
        System.out.println("Enter the number you wish to convert");
        int n = input.nextInt();
        System.out.println("Enter in the base integer");
        int b = input.nextInt();
        System.out.println(Convert(n,b));
        input.nextLine();
        System.out.println("Enter in the word to determine if it is a palindrome or not");
        String s = input.nextLine();
        System.out.println(isPalindrome(s));
        
        
        
        System.out.println("Enter the maximum amount of marbles the box can hold");
        int max = input.nextInt();
        System.out.println("Enter the number of bags");
        int number = input.nextInt();
        int[] bags = new int[number];
        
        for(int i = 0; i < bags.length; i++){
            bags[i] = input.nextInt();
        }

        System.out.println(Marble(max,bags) + " is the maximum number of marbles that can fit into the box");
    }
    
    
    
    
    
    
    
   
}

