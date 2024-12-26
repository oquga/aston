import java.util.ArrayList;
import java.util.Comparator;

public class SearchBarrel {
    public int barrelSearch(ArrayList<Barrel> barrels, Barrel serachBarrel, Comparator<Barrel> comparator1){
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.perform(barrels, serachBarrel, comparator1);
        return index;
    }
}
