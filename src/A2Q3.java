
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,5,5, Direction.EAST);
        // This automatically sets Karel to face NORTH
        while(karel.getDirection() !=Direction.NORTH) {
            karel.turnLeft();
            
     
            
        }
        while(karel.getStreet() != 0){
            karel.move();
        }
        
        
        if(karel.getAvenue() > 0){
            karel.turnLeft();
            
            
        }
        // This makes Karel move until he hits the 0 mark
            while(karel.getAvenue() != 0){
                karel.move();
            }
        
        
            
                
            }
            
        
    }
    

