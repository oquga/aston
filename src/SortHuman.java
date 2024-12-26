import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SortHuman {
    public ArrayList<Human> humanSort(ArrayList<Human> humans, Comparator<Human> comparator){
        InsertionSort<Human> insertionSort = new InsertionSort<>();
        insertionSort.perform(humans, comparator);
        return humans;
    }
}