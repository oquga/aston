package Searchers;

import Algorithms.BinarySearch;
import Domain.Human;
import Interfaces.Searcher;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchHuman implements Searcher<Human> {
    public int search(ArrayList<Human> humans, Human searchHuman, Comparator<Human> comparator){
        return BinarySearch.perform(humans, searchHuman, comparator);
    }
}
