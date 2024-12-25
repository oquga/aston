import java.util.ArrayList;
import java.util.Comparator;

class SortAnimal{
    public ArrayList<Animal> AnimalTypeSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalTypeComparator());
        System.out.println("Animals sorted by Type:");
        for (Animal animal : animals) {
            System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }
        System.out.println();
        return animals;
    }
    public ArrayList<Animal> AnimalEyeColorSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalEyeColorComparator());
        System.out.println("Animals sorted by Eye Color:");
        for (Animal animal : animals) {
            System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }
        System.out.println();
        return animals;
    }
    public ArrayList<Animal> AnimalFurSort(ArrayList<Animal> animals){
        InsertionSort<Animal> insertionSort = new InsertionSort<>();
        insertionSort.perform(animals, new AnimalFurComparator());
        System.out.println("Animals sorted by Fur Presence:");
        for (Animal animal : animals) {
            System.out.println("Type: "+animal.getType() + ", Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }
        System.out.println();
        return animals;
    }
}