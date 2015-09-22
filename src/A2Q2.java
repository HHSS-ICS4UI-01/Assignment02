
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1, Direction.EAST);
        new Wall(kw,1,1, Direction.EAST);
        new Wall(kw,1,2, Direction.EAST);
        new Wall(kw,1,4, Direction.EAST);
        new Wall(kw,1,7, Direction.EAST);
        new Wall(kw,1,1, Direction.SOUTH);
        new Wall(kw,1,2, Direction.SOUTH);
        new Wall(kw,1,3, Direction.SOUTH);
        new Wall(kw,1,4, Direction.SOUTH);
        new Wall(kw,1,5, Direction.SOUTH);
        new Wall(kw,1,6, Direction.SOUTH);
        new Wall(kw,1,7, Direction.SOUTH);
        new Wall(kw,1,8, Direction.SOUTH);
        new Wall(kw,1,9, Direction.SOUTH);
        new Thing(kw,1,9);
       
        while(true){
            // Karel JUMPS!
        if(!karel.frontIsClear()){
            karel.turnLeft();
            
            
           
        }else{
            karel.move();
            
            // If clear, turn right
            if(karel.frontIsClear()){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            }
            //Karel stops here as he picks it up
            if(karel.getAvenue()==9){
                
                if(karel.getStreet()==1);
                karel.pickThing();
                break;
                
                
                
                
            
            
            
            
            
            
            
        
    
  }
            
}
}
}
}

