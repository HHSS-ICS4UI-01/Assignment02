


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author janaj4926
 */
public class Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(convert(1000, 8));
        
    }
    //
    static String convert(int n, int b){
        if (n<b){
            return alphabet(n);
        }
        
        return convert(n/b,b) + alphabet(n%b);
    }
    
    
    static String alphabet(int n){
        if (n == 10){
            return "A";
        }else if(n == 11){
            return "B";
        }else if(n == 12){
            return "C";
        }else if(n == 13){
            return "D";
        }else if(n == 14){
            return "E";
        }else if(n == 15){
            return "F";
        }else {
            return "" + n;
        }
    }
}
