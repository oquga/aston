import java.util.Comparator;
import java.util.List;

public class InsertionSort<T> {

    public void perform(List<T> list, Comparator<T> comparator){
        for (int i = 1; i < list.size(); i++) {
            T currentElement = list.get(i);
            int j = i;

            while (j > 0 && comparator.compare(currentElement, list.get(j - 1)) < 0) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, currentElement);
        }
    }


}
