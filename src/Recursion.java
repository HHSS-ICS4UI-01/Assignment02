
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kampn2687
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //question 1
        System.out.println("enter positive interger");
        int n = in.nextInt();
        System.out.println(sumDigits(n));
        
        //question 2
        System.out.println("enter a level on the triangle");
        int u = in.nextInt();
        System.out.println(triangle(u));
        
        //question 3
        System.out.println("enter binary num to be converted");
        int z= in.nextInt();
        System.out.println(binaryConvert(z));
        
        //question 4
        System.out.println("enter a number");
        int k = in.nextInt();
        System.out.println("enter in a base in the range of 2-16");
        int b = in.nextInt();
        System.out.println(convert(k,b));
        
        
        // Querstion 5
        System.out.println("enter a word to see if it is a palindrome");
        String t = in.nextLine();
        System.out.println(palindrome(in.nextLine()));
        
        
        //question 6
        System.out.println("enter number of bags");
        int r = in.nextInt();
        System.out.println("enter the max number of marbles ");
        int max = in.nextInt();
        int[] mabs = new int[r];
        System.out.println("enter " + r + " numbers largest to smallest");

        for (int i = 0; i < r; i++) {
            mabs[i] = in.nextInt();
        }
        System.out.println(marbles(mabs,max)); 
        
        // TODO code application logic here
    }
    static int sumDigits(int n){
        if(n < 10 && n>= 0){
            return n;
        }
        return n % 10 + sumDigits(n/10);
    }
    static String binaryConvert(int n) {
        if(n== 0 ||n == 1) {
            return "" + n;
        }
        return binaryConvert(n /2)+ n%2;
    }
    
    static String letters(int n, int b)
    {
        if(n == 0 || n == b ){
            return "" + n;
        }else if(b > 10 && n == 10){
            return "A"; 
        }else if(b > 10 && n == 11){
            return "B"; 
        }else if(b > 10 && n == 12){
            return"C"; 
        }else if(b > 10 && n == 13){
            return "D"; 
        }else if(b > 10 && n == 14){
            return"E"; 
        }else if(b > 10 && n == 15){
           return"F"; 
        }
        return "";
    }
    
    static String convert(int n, int b){
        if(n == 0 || n == b ){
            return "" + n;
        }else if(b > 10 && n == 10){
            return "A"; 
        }else if(b > 10 && n == 11){
            return "B"; 
        }else if(b > 10 && n == 12){
            return"C"; 
        }else if(b > 10 && n == 13){
            return "D"; 
        }else if(b > 10 && n == 14){
            return"E"; 
        }else if(b > 10 && n == 15){
           return"F"; 
        }
        return convert(n/b,b) + letters(n%b,b);
        
    } 
    static boolean palindrome(String n){
        if(n.length() == 1 || n.length()==0){
            return true;
        }
        if(n.charAt(0) == n.charAt(n.length()-1)){
        return palindrome(n.substring(1,n.length()-1));
    }
        else{
            return false;
        }   
        
    }
    static int triangle(int n){
        if( n == 1){
            return 1;
        }
        return n +triangle(n-1);
    }

    static int marbles(int[] bags, int max) {
        if (bags.length == 0) {
            return 0;
        }
        int[] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];
        for (int i = 0; i < leftOvers.length; i++) {
            leftOvers[i] = bags[i + 1];
        }
        int with = aBag + marbles(leftOvers, max - aBag);
        int withOut = marbles(leftOvers, max);
        if (with > withOut && with <= max) {
            return with;
        } else if (withOut <= max) {
            return withOut;
        } else {
            return 0;
        }

    }
}
