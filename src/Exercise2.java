/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author besem4079
 */
public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int ans = sumDigits(1235);
        System.out.println(ans);
        
        int triAns = triangle(4);
        System.out.println(triAns);
    }
       
    static int sumDigits(int n){
        if(n < 9)
        {
            return n;
        }else 
        {
            return sumDigits(n % 10) + sumDigits(n / 10);
        }
    }
    
    static int triangle(int n){ 
        if(n <= 1)
        {
            return n;
        }
        
        return triangle(n) + triangle(n - 1);
        
    }
}
