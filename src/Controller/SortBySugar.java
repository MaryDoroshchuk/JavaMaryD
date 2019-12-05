package Controller;


import Model.Sweets;

public class SortBySugar implements Sort {

        @Override
        public int compare(Sweets ob1, Sweets ob2) {
            return Double.compare(ob1.sugarCompound(), ob2.sugarCompound());
        }
}

