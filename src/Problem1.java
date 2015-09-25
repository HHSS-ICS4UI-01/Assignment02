
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author murra9546
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = input.nextLine();
        int length = 0;
        System.out.println(isPalindrome(s, length));
    }

    //problem 1
    static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }

    }

    //problem 2
    static int triangle(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + triangle(n - 1);
        }
    }

    //problem 3    
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

    //problem 4
    static String convert(int n, int b) {
        int q = 0;
        int r = 0;
        String let = "";
        if (n <= b) {
            return "" + n;
        } else {
            r = n % b;
        }
        q = n / b;
        if (r == 10) {
            let = "A";
            return convert(q, b) + let;
        } else if (r == 11) {
            let = "B";
            return convert(q, b) + let;
        } else if (r == 12) {
            let = "C";
            return convert(q, b) + let;
        } else if (r == 13) {
            let = "D";
            return convert(q, b) + let;
        } else if (r == 14) {
            let = "E";
            return convert(q, b) + let;
        } else if (r == 15) {
            let = "F";
            return convert(q, b) + let + r;
        } else {
            return convert(q, b) + r;
        }
    }
    
    
    
    //problem 5
    static boolean isPalindrome(String s, int length) {
        boolean palin = false;
     
        int x = 0;
        s = s.substring(x, length);
        if(length <= 1)
        { 
            return false;
        }else 
        {
            x++;
            length--;
            return true;
        }
       
    }
}
