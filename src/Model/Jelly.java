package Model;

public class Jelly extends Sweets {
    public Jelly(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getName() {
        return "Jelly: ".concat(name);
    }

    /**
     * Метод для розрахунку вмісту цукру желейок
     */

    public double sugarCompound() {
        return weight * 0.3;
    }
}
