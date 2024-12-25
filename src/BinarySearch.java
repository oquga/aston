import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class BinarySearch {
    public static <T> int perform(ArrayList<T> list, T target, Comparator<? super T> comparator){
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (comparator.compare(list.get(mid), target)==0) {
                return mid;
            } else if (comparator.compare(list.get(mid), target)<0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
