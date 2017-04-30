
package mooc;

import java.util.ArrayList;
import java.util.Collections;

public class Suitcase {
    
    private int counter;
    private int sum;
    ArrayList<Thing> things;
    private final int WEIGHTLIMIT;
    
    public Suitcase(int weightLimit){
        
        things = new ArrayList<Thing>();

        this.WEIGHTLIMIT = weightLimit;
        
    }
    
    public void addThing(Thing thing){
       
       int limit = sum + thing.getWeight();
       
       if(WEIGHTLIMIT > limit){
           things.add(thing); 
           sum += thing.getWeight();
           counter ++;
          
       }
        
    }
    
    public void printThings(){
        
        int sum  = 0;
        for(Thing thingy : things)
            System.out.println(thingy);  
    }
    
    public int totalWeight(){
        
        int sum  = 0;
        for(Thing thingy : things)
            sum += thingy.getWeight();
        
        return sum;
    }
    
    public Thing heaviestThing(){
        
        //Need to check the 'things' array objects for their weight and compare the two.
        //likely need to return the index of the array object
        
        int temp = 0;
        Thing heaviestThing = new Thing("", 0);
        
        for (Thing thing : things){
            if(thing.getWeight() > temp){
                temp = thing.getWeight();
                heaviestThing = thing;
            }
                
            }
            return heaviestThing;

        
    }
    
    public String toString(){
        
        if(sum == 0){
            return  "Empty " + " (" + sum + " kg)";
        }
        if(counter == 1){
        return counter + " thing" + " (" + sum + " kg)";
        }
        else{
            return counter + " things" + " (" + sum + " kg)";

        }
    }
    
}
