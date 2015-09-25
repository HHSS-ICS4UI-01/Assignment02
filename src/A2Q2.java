
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
 * @author malcr1272
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();

        Robot karel = new Robot(kw, 3, 1, Direction.EAST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.EAST);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 5, Direction.SOUTH);
        new Wall(kw, 3, 6, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.SOUTH);
        new Wall(kw, 3, 7, Direction.EAST);
        new Wall(kw, 3, 8, Direction.SOUTH);
        new Wall(kw, 3, 9, Direction.SOUTH);

        new Thing(kw, 3, 9);

        while (true) {
            if (karel.frontIsClear() && karel.countThingsInBackpack() >1)
            {
                karel.move();
            }else{
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            }
            
            

    
    

    

    
    

 
    
}
      
         
              

    }
}
