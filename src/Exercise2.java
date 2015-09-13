
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author branc2347
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num1 = input.nextInt();
        System.out.println(triangle(num1));
    }
     public static int sumDigits(int n){
         if(n < 10){
             return n;
         }
         else{
             return ((n%10)+ sumDigits(n/10));
         }
     }
     public static int triangle(int n){
         if(n == 0 || n == 1){
             return n;
         } else{
             return (n + triangle(n-1));
         }
         
     }
}
