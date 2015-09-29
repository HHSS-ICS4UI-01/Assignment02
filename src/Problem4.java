
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problem4 {
    static String convert(int n,int b) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n<b)
        {
            if(n==0)
            {
                return "0";
            }
            if(n==1)
            {
                return "1";
            }
            if(n==2)
            {
                return "2";
            }
            if(n==3)
            {
                return "3";
            }
            if(n==4)
            {
                return "4";
            }
            if(n==5)
            {
                return "5";
            }
            if(n==6)
            {
                return "6";
            }
            if(n==7)
            {
                return "7";
            }
            if(n==8)
            {
                return "8";
            }
            if(n==9)
            {
                return "9";
            }
            if(n==10)
            {
                return "A";
            }
            if(n==11)
            {
                return "B";
            }
            if(n==12)
            {
                return "C";
            }
            if(n==13)
            {
                return "D";
            }
            if(n==14)
            {
                return "E";
            }
            if(n==15)
            {
                return "F";
            }
            if(n==16)
            {
                return "G";
            }
        }
        else
        {
            if(n%b==0)
            {
                return (convert(n/b, b) + "0");
            }if(n%b==1)
            {
                return (convert(n/b, b) + "1");
            }if(n%b==2)
            {
                return (convert(n/b, b) + "2");
            }if(n%b==3)
            {
                return (convert(n/b, b) + "3");
            }if(n%b==4)
            {
                return (convert(n/b, b) + "4");
            }if(n%b==5)
            {
                return (convert(n/b, b) + "5");
            }if(n%b==6)
            {
                return (convert(n/b, b) + "6");
            }if(n%b==7)
            {
                return (convert(n/b, b) + "7");
            }if(n%b==8)
            {
                return (convert(n/b, b) + "8");
            }if(n%b==9)
            {
                return (convert(n/b, b) + "9");
            }if(n%b==10)
            {
                return (convert(n/b, b) + "A");
            }if(n%b==11)
            {
                return (convert(n/b, b) + "B");
            }if(n%b==12)
            {
                return (convert(n/b, b) + "C");
            }if(n%b==13)
            {
                return (convert(n/b, b) + "D");
            }if(n%b==14)
            {
                return (convert(n/b, b) + "E");
            }if(n%b==15)
            {
                return (convert(n/b, b) + "F");
            }else
            {
                return (convert(n/b, b) + "G");
            }
      
        }
        return null;      
        
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non negative whole number to convert: ");
        int n = input.nextInt();
        
        System.out.print("Please enter a non negative whole number to covert the base: ");
        int b = input.nextInt();
        
        if(n < 1 || b < 2 || b > 16)
        {
            System.out.println("Please follow directions!!!");
        }else
        {
            System.out.println(convert(n,b));
        }
    }
}
