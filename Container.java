
package mooc;

import java.util.ArrayList;

public class Container {
    
    private int counter = 0;
    private final int MAXWEIGHT;
    ArrayList<Suitcase> suitCase;
    public Container(int maxWeight){
        
        suitCase = new ArrayList<Suitcase>();
        this.MAXWEIGHT = maxWeight;
        
    }
    
    public void addSuitcase(Suitcase suitcase){
       //add if statement for max limit
        
        if(this.totalWeight() + suitcase.totalWeight() <= this.MAXWEIGHT){
            suitCase.add(suitcase);
            counter++;
        }       
    }
    
    public int totalWeight(){
        int total = 0;
        for (Suitcase s: suitCase){
            total += s.totalWeight();
        }
        return total;
    }

        public String toString(){
        
        return counter + " suitcases: " + totalWeight() + " kg";
  
    }
        public void printThings(){
            for (Suitcase s : suitCase){
               s.printThings();
        }
    }
}
