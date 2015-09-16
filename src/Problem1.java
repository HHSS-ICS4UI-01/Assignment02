/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author janaj4926
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //divide 10, %10
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please input a number to have its digits summed up:");
        int num = in.nextInt();
        int ans = sumOfDigits(num);
        System.out.println("The answer is " + ans + ".");
    }
    static int sumOfDigits(int n){
        if(n >= 0 & n<10){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
