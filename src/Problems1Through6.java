/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paulm6438
 */
public class Problems1Through6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
    }
    
    //
    static long sumDigits(int n)
    {
        if(n < 10)
        {
            return n;
        }else
        {
            int lD = n/10;
            int rD = n%10;
            return sumDigits(lD) + rD;
            
        }
    }
    
    //
    static long trig(int n) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n==1)
        {
            return 1;
        }else
        {
            int row = n;
            return trig(n-1) + row;
        }
    }
    
    //
    static String binaryConvert(int n) //or static int fib(int n), static short fib(int n), static int byte(int n)
    {
        if(n==1)
        {
            return "1";
        }
        if(n==0)
        {
            return "0";
        }
        else
        {
            if(n%2==0)
            {
                return (binaryConvert(n/2) + "0");
            }else
                
                return (binaryConvert(n/2) + "1");
        }
    }
    
    //
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
    
    //
    public static boolean isPalindrome (String s){
        if(s.length() <= 1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length() -1)){
            return isPalindrome(s.substring(1,s.length() -1));
        }else{
            return false;
        }
}
    
    //
    public int marbles(int[] bags, int max){
        if(bags.length==0){
            return 0;
        }
        int[] leftOvers = new int[bags.length - 1];
        int aBag = bags[0];
        for(int i = 0; i < leftOvers.length; i++){
            leftOvers[i] = bags[i+1];
        }
        int with = aBag + marbles(leftOvers, max - aBag);
        int withOut = marbles(leftOvers,max);
        
        if(with > withOut && with < max){
            return with;
        }else if(withOut < max){
            return withOut;
        }else{
            return 0;
        }
        
    }  
    
}
