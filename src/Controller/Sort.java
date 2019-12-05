package Controller;

import Model.Sweets;
import java.util.Comparator;

public interface Sort extends Comparator<Sweets> {

    @Override
    int compare(Sweets o1, Sweets o2);
}

