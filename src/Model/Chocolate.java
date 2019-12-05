package Model;

public class Chocolate extends Sweets {
    public Chocolate(String name, double weight) {
        super(name, weight);
    }

    @Override
    public String getName() {
        return "Chocolate: ".concat(name);
    }

    /**
     * Метод для розрахунку вмісту цукру шоколаду
     */

    public double sugarCompound() {
        return weight * 0.2;
    }
}
