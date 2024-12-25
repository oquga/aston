import java.util.ArrayList;
import java.util.Comparator;

class SortAnimal{
    public ArrayList<Animal> AnimalTypeSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalTypeComparator());
        return animals;
    }
    public ArrayList<Animal> AnimalEyeColorSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalEyeColorComparator());
        return animals;
    }
    public ArrayList<Animal> AnimalFurSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalFurComparator());
        return animals;
    }
}