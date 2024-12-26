package Comparators;

import Domain.Human;

import java.util.Comparator;

public class HumanGenderComparator implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getGender().compareTo(o2.getGender());
    }
}
