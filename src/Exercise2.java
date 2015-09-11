/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haidj9901
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(convert(100, 3));
    }
    
    public static int sumDigits(int n)
    {
        if (String.valueOf(n).length() == 1)
        {
            return n;
        }
        return (n%10 + sumDigits(n/10));
    }
    
    public static int triangle(int n)
    {
        if (n == 1 || n == 0)
        {
            return n;
        }
        return n + triangle(n-1);
    }
    
    public static String binaryConvert(int n)
    {
        if (n/2 == 0)
        {
            return String.valueOf(n%2);
        }
        return "" + binaryConvert(n/2) + n%2;
    }
    
    public static String convert(int n, int b)
    {
        if (n < b)
        {
            return String.valueOf(n);
        }
        return "" + binaryConvert(n/b) + n%b;
    }
    
}
