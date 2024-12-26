package Comparators;

import Domain.Animal;
import java.util.Comparator;

public class AnimalFurComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Boolean.compare(o1.getHasFur(), o2.getHasFur());
    }
}
