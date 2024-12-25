import java.util.ArrayList;
import java.util.Comparator;

public class SortHuman {
    public ArrayList<Human> HumanAgeSort(ArrayList<Human> humans){
        InsertionSort<Human> insertionSort = new InsertionSort<>();
        Comparator comparator1 = new HumanAgeComparator();
        insertionSort.perform(humans, comparator1);
        return humans;
    }

    public ArrayList<Human> HumanSurnameSort(ArrayList<Human> humans){
        InsertionSort<Human> insertionSort = new InsertionSort<>();
        Comparator comparator2 = new HumanSurnameComparator();
        insertionSort.perform(humans, comparator2);
        return humans;
    }

    public ArrayList<Human> HumanGenderSort(ArrayList<Human> humans){
        InsertionSort<Human> insertionSort = new InsertionSort<>();
        Comparator comparator3 = new HumanGenderComparator();
        insertionSort.perform(humans, comparator3);
        return humans;
    }
}