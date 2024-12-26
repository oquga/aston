package Comparators;

import Domain.Barrel;

import java.util.Comparator;

public class BarrelContentComparator implements Comparator<Barrel> {
    @Override
    public int compare(Barrel o1, Barrel o2) {
        return o1.getContent().compareTo(o2.getContent());
    }
}
