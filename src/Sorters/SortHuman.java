package Sorters;

import Algorithms.InsertionSort;
import Domain.Human;
import Interfaces.Sorter;

import java.util.ArrayList;
import java.util.Comparator;

public class SortHuman implements Sorter<Human> {
    public ArrayList<Human> sort(ArrayList<Human> humans, Comparator<Human> comparator) {
        InsertionSort<Human> insertionSort = new InsertionSort<>();
        insertionSort.perform(humans, comparator);
        return humans;
    }
}