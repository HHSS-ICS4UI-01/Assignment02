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
    
        int ans = sumDigits(136);
        System.out.println(ans);
        
        int triAns = triangle(3);
        System.out.println(triAns);
    }
       
    static int sumDigits(int n){
        if(n > 0 && n <= 9)
        {
            return n;
        }
        
        return sumDigits(n % 10) + sumDigits(n / 10);
    }
    
    static int triangle(int n){ 
        if(n == 1)
        {
            return 1;
        }else if(n == 0)
        {
            return 0;
        }
        
        return triangle(n);
        
    }
}
