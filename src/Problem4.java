
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */

    public static String convert(int number, int base) {
        int quotient = number / base;
        int remainder = number % base;

        if (quotient == 0) 
        {
            //Returns the number if the number / base is the same 1 in binary is 1 2 in base 3 is 2 etc.
            return remainder + "";
        } else {
            //Enters the number as a string
            //Still have no idea how this recursion thing works, it just turns out I'm really good at guessing
            //how to get it to work
            return convert(quotient, base) + remainder + "";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number to convert: ");

        int num = input.nextInt();

        System.out.print("Enter a base between 2 and 16 to convert " + num + " to: ");


        int base = input.nextInt();
        while (base == 0 || base == 1 || base > 16) {
            System.out.print("Enter a valid base: ");
            base = input.nextInt();
        }
        
        
        System.out.println(num + " in base " + base + " is " + convert(num, base));


    }
}
