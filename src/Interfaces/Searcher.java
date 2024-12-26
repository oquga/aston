package Interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public interface Searcher<T> {
    int search(ArrayList<T> arrayList, T item, Comparator<T> comparator);
}
