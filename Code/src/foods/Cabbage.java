
package foods;


public class Cabbage extends Vegetable{
    private int area ;
    
    public Cabbage() {
        
        super("Cabbage",239.75 , 10, 0);
        
        preferredSoil = Soil.Clay;
        
        area = 50;
    }
}
