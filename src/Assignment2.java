
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


        int num = 3;
        System.out.println(triangle(num));
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
    
    










}




