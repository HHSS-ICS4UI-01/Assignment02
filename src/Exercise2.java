/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobed6328
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(triangle(3));
    }
    
    public static int sumDigits(int n)
    {
        if (n < 10)
        {
            return n;
        }
        return n%10 + sumDigits(n/10);
    }
            
    public static int triangle(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        return n + triangle(n-1);
    }
    
}
