import java.util.ArrayList;
import java.util.Comparator;

class SortAnimal{
    public ArrayList<Animal> animalSort(ArrayList<Animal> animals, Comparator comparator){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, comparator);
        return animals;
    }
}