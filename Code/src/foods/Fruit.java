
package foods;

public class Fruit extends Food{

    public Fruit(String name, double sellPrice, int daysToMature, int daysSincePotted) {
        super(name, sellPrice, daysToMature, daysSincePotted);
        preferredSoil = Soil.Silt;
    }

    @Override
    public double grow(Soil soil) {
        //TODO
        
        //skip two days
        
        return 0;
    }

    @Override
    public int compareTo(Food o) {
        return 0;
    }
}
