


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 126;
        System.out.println(sumDigits(num));
    }
    //problem 1
    public static int sumDigits(int num)
    {
        if (num<10)
        {
            return num;
        }else
        {
            return num%10 + sumDigits(num/10);
        }
    }
    
    //problem 2
    public static int triangle(int num)
    {
     if(num==0)
     {
         return 0;
     }
     if(num==1)
     {
         return 1;
     }else{
         return num + triangle(num-1);
     }
    }
    //problem 3
    public static String binaryConvert(int num )
    {
     if(num==0)
     {
        
         return "0";
     }if(num==1)
     {
         return "1";
     }
     if(num%2==1)
     {     
        return (binaryConvert(num/2) + "1"); 
     }else
     {         
      return (binaryConvert(num/2) + "0");
     }
    }
    
    //problem 4
   
    
    
}
