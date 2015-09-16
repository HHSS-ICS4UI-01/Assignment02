
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
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        System.out.println(triangle(n));
        
        

    }
    
    
    
    static int sumDigits(int n){
        if(n <10)
        {
            return n;
        }else{
            return n % 10 + sumDigits(n/10);
        }
    }
    
    static int triangle(int n){
        if (n == 1) {
            return 1;
        }else return n + triangle(n-1);    
    }
    
    static int binaryConvert(int n){
        if (n == 1) {
            
        }
    }
    
    
    
    
    
    
    
}
