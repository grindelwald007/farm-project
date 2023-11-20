
package foods;


public class Vegetable extends Food {

    public Vegetable(String name, double sellPrice, int daysToMature, int daysSincePotted) {
        super(name, sellPrice, daysToMature, daysSincePotted);
        preferredSoil = Soil.Loam;
    }

    @Override
    public double grow(Soil soil) {
        //TODO
        return 0;
    }

    @Override
    public int compareTo(Food o) {
        return 0;
    }
}
