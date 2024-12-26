package Searchers;

import Domain.Barrel;
import Algorithms.BinarySearch;
import Interfaces.Searcher;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchBarrel implements Searcher<Barrel> {
    public int search(ArrayList<Barrel> barrels, Barrel serachBarrel, Comparator<Barrel> comparator){
        return BinarySearch.perform(barrels, serachBarrel, comparator);
    }
}
