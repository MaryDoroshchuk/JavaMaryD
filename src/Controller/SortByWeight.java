package Controller;

import Model.Sweets;

public class SortByWeight implements Sort {

    @Override
    public int compare(Sweets t1, Sweets t2) {
        return Double.compare(t1.getWeight(), t2.getWeight());
    }
}

