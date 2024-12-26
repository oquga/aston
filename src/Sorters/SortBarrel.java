package Sorters;

import Domain.Barrel;
import Algorithms.InsertionSort;
import Interfaces.Sorter;

import java.util.ArrayList;
import java.util.Comparator;

public class SortBarrel implements Sorter<Barrel> {
    public ArrayList<Barrel> sort(ArrayList<Barrel> barrels, Comparator<Barrel> comparator){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, comparator);
        return barrels;
    }
}