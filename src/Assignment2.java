
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


        int[] num = new int[5];
        num[0] = 12;
        num[1] = 14;
        num[2] = 18;
        num[3] = 33;
        num[4] = 34;
        
        //System.out.println(Convert(num,8));
        System.out.println(marbles(50,num));
    }

    public static int sumDigits(int n) {

        if (n < 10) {
            return n;
        } else {
             return n % 10 + sumDigits(n / 10);
            
        }

    }
    
    public static int triangle(int n){
      
        if (n==1){
            return 1;
        }else{
            return n + triangle(n-1);
        }
        
        
    }
    
    public static String binaryConvert(int n){
      
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        if (n % 2 == 0) {
            return (binaryConvert(n / 2) + "0");

        } else {
            return (binaryConvert(n / 2) + "1");
        }


    }

    public static String Convert(int n, int b) {
        if (n <= b) {
            return "" + n;
        }
        int r = n % b;
        String e = "";
        if (r == 0) {
            return (Convert(n / b, b) + "" + 0);
        } else {
            if (r > 9) {
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


            } else {
                e = "" + r;
            }


            return (Convert(n / b, b) + e);
        }



    }
    public static boolean isPalindrome(String n){
      int length = n.length();
        if(length==1){
           return true;
       }
        if(length==2&&n.charAt(0)==n.charAt(1)){
           return true;
        }
       if(n.charAt(0)==n.charAt(length-1)){
       String x = n.substring(1, length-1);
           
       return isPalindrome(x);
         } else {
       
        return false;
       }
       
    }
    
    public static int marbles(int max, int[] bags){
        return 0;
        
    }
    
    
    
    
    
    










}




