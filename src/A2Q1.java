
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        new Thing(kw,1,2);
        new Thing(kw,1,1);
        new Thing(kw,1,3);
        new Thing(kw,1,4);
        new Thing(kw,1,5);
        new Thing(kw,1,6);
        new Thing(kw,1,7);
        new Thing(kw,1,8);
        new Thing(kw,1,9);
        new Thing(kw,1,10);
        
        Robot karel = new Robot(kw,1,0, Direction.EAST);
        karel.move();
        
        while(true){
            //Karel keeps picking up until his backpack reaches 7
            if (karel.countThingsInBackpack()< 7){
        
            karel.pickThing();
            karel.move();
        }else {
               break;
        }    
            
             
                
            }
         karel.move();
                karel.move();
                karel.move();
                
                
            
                    
                
                
                         
        
        
}
}




        
    

