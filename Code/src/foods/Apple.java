
package foods;


public class Apple extends Fruit{
    private int area ;
    
    public Apple() {
        
        super("Apple",1250.00 , 15, 0);
        
        preferredSoil = Soil.Loam;
        
        area = 275;
    }
}
