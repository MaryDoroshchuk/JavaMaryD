package Model;

public abstract class Sweets  {
    protected String name;
    protected double weight;

    public Sweets(){
    }

    public Sweets(String name, double weight){
        this.name = name;
        this.weight = weight;

    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }

    public abstract double sugarCompound();
}
