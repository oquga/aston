package Interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public interface Sorter<T> {
    ArrayList<T> sort(ArrayList<T> arrayList, Comparator<T> comparator);
}
