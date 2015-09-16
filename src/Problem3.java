/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author janaj4926
 */
public class Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(binaryConvert(156));
        
    }
    static String binaryConvert(int n){
        if (n == 1){
            return "1";
        }
        if (n == 0){
            return "0";
        }
        return binaryConvert(n/2) + n%2;
    }
}
