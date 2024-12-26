package Searchers;

import Algorithms.BinarySearch;
import Domain.Animal;
import Interfaces.Searcher;

import java.util.ArrayList;
import java.util.Comparator;

public class SearchAnimal implements Searcher<Animal> {
    public int search(ArrayList<Animal> animals, Animal searchAnimal, Comparator<Animal> comparator) {
        return BinarySearch.perform(animals, searchAnimal, comparator);
    }
}
