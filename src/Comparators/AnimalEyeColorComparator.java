package Comparators;

import Domain.Animal;
import java.util.Comparator;

public class AnimalEyeColorComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getEyeColor().compareTo(o2.getEyeColor());
    }
}
