package Model;

import Controller.Sort;
import java.util.ArrayList;

public class Present {
    /**
     * Місце для зберігання солодощів
     */
    private ArrayList<Sweets> sweets = new ArrayList();

    public Present() {
    }

    /**
     * Метод для додавання нових солодощів
     */

    public void add(Sweets sweet) {
        if (sweet == null) {
            throw new IllegalArgumentException();
        }
        sweets.add(sweet);
    }

    /**
     * Метод для сумування ваги всіх солодощів
     */

    public double getWeight() {
        double weight = 0;
        for (Sweets sweet : sweets
        ) {
            weight += sweet.getWeight();
        }
        return weight;
    }

    /**
     * Метод для пошуку солодощів у заданому діапазоні вмісту цукру
     */

    public Sweets range (double minSugar, double maxSugar) {
        for (Sweets sweet : sweets
        ) {
            if (sweet.sugarCompound() >= minSugar && sweet.sugarCompound() <= maxSugar)
                return sweet;
        }
        return null;
    }

    public void sort(Sort t) {
        sweets.sort(t);
    }

    @Override
    public String toString() {
        String s = "";
        for (Sweets sweet : sweets
        ) {
            s += sweet.getName();
            s += "\n";
        }
        return s;
    }
}
