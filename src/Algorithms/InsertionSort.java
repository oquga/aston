import java.util.Comparator;
import java.util.List;

public class InsertionSort<T> {

    public void perform(List<T> list, Comparator<T> comparator){
        for (int i = 1; i < list.size(); i++) {
            T currentElement = (T) list.get(i);
            int j = i;

            // Compare current element with previous elements
            while (j > 0 && comparator.compare(currentElement, list.get(j - 1)) < 0) {
                list.set(j, list.get(j - 1)); // Shift element to right
                j--;
            }
            list.set(j, currentElement); // Insert current element at correct position
        }
    }


}