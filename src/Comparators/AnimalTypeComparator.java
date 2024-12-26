package Comparators;

import Domain.Animal;
import java.util.Comparator;

public class AnimalTypeComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getType().compareTo(o2.getType());
    }
}
