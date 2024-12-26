package Sorters;

import Algorithms.InsertionSort;
import Domain.Animal;
import Interfaces.Sorter;

import java.util.ArrayList;
import java.util.Comparator;

public class SortAnimal implements Sorter<Animal> {
    public ArrayList<Animal> sort(ArrayList<Animal> animals, Comparator<Animal> comparator){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, comparator);
        return animals;
    }
}