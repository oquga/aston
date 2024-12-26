import java.util.ArrayList;
import java.util.Comparator;

public class SearchAnimal {
    public int animalSearch(ArrayList<Animal> animals, Animal searchAnimal, Comparator comparator1){
        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.perform(animals, searchAnimal, comparator1);
        return index;
    }
}
