
package mooc;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] Container) {
        
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        
        for(int x = 0; x < 100; x++){
            
            Thing brick = new Thing("Brick" , x+1); 
            Suitcase suit = new Suitcase(1000);
            suit.addThing(brick);
            container.addSuitcase(suit);
            
            }
        }

}        
       
        
    
