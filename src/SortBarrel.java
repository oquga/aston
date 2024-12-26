import java.util.ArrayList;
import java.util.Comparator;

class SortBarrel{
    public ArrayList<Barrel> barrelSort(ArrayList<Barrel> barrels, Comparator comparator){
        InsertionSort<Barrel> insertionSort = new InsertionSort<>();
        insertionSort.perform(barrels, comparator);
        return barrels;
    }
}