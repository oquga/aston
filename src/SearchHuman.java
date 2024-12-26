import java.util.ArrayList;
import java.util.Comparator;

public class SearchHuman {
    public int humanSearch(ArrayList<Human> humans, Human searchHuman, Comparator<Human> comparator1){
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.perform(humans, searchHuman, comparator1);
        return index;
    }
}
