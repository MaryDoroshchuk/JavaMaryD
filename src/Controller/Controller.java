package Controller;

import Model.*;
import View.*;

public class Controller {

    public Controller(Model model, View view) {
        Present present = new Present();
        present.add(new Chocolate("Milka", 100));
        present.add(new Chocolate("Toffe", 75));
        present.add(new Jelly("Bee", 25));

        view.printMessages(view.getBundleString(TextConstant.YOUR_PRESENT));
        System.out.print(present.toString()+"\n");

        view.printMessages(view.getBundleString(TextConstant.WEIGHT_PRESENT));
        System.out.println(present.getWeight() + " gram" + "\n");

        view.printMessages(view.getBundleString(TextConstant.SORT_WEIGHT));
        present.sort(new SortByWeight());
        System.out.println(present.toString());

        view.printMessages(view.getBundleString(TextConstant.SORT_SUGAR));
        present.sort(new SortBySugar());
        System.out.println(present.toString());

        view.printMessages(view.getBundleString(TextConstant.FIND_SUGAR));
        System.out.print(present.range(1, 10).getName());
    }
}
