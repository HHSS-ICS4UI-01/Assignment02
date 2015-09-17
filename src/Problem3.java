
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johns6971
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    static String stringBinary;

    static String binary(int n) 
    {
        if (n < 2) 
        {
            //if n = 1 or 0 it returns n
            stringBinary = "" + n;
            return stringBinary;


        } else {
            if (n != 0) 
            {
                //I hardly know how this works
                binary(n / 2);
                //adding remainder to string
                stringBinary += "" + n % 2;

            }
        }
        return stringBinary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a number to convert to binary: ");

        int n = input.nextInt();



        System.out.println(n + " in binary is " + binary(n));

    }
}
