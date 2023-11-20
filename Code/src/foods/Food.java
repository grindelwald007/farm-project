
package foods;

//The food class implements the comparable interface

public abstract class Food implements Comparable<Food>{

    String name;
    
    double sellPrice;
    
    final int daysToMature;
    
    int daysSincePotted;
    
    int requiredArea;
    
    Soil preferredSoil;
    
    
    Food(String name, double sellPrice, int daysToMature, int daysSincePotted){
 
        this.name = name;
        
        this.sellPrice = sellPrice;
        
        this.daysToMature = daysToMature;
        
        this.daysSincePotted = daysSincePotted;
  
    }

    public String getName() {
        return name;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getDaysToMature() {
        return daysToMature;
    }

    public int getDaysSincePotted() {
        return daysSincePotted;
    }

    public int getRequiredArea() {
        return requiredArea;
    }

    public Soil getPreferredSoil() {
        return preferredSoil;
    }
    
    protected double grow(){
        
        daysSincePotted = daysSincePotted + 1;
        
        double percentage = Math.min(daysSincePotted / daysToMature, 1);
                     
        return percentage;
    }
    
    public abstract double grow(Soil soil);

    @Override
    public String toString() {
        return "Food{" + "name=" + name + ", sellPrice=" + sellPrice + ", daysToMature=" + daysToMature + ", daysSincePotted=" + daysSincePotted + ", requiredArea=" + requiredArea + ", preferredSoil=" + preferredSoil + '}';
    }
    
}
