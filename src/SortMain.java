import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SortMain {
    public static void main(String[] args) {
//        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 9, 1, 5, 6));
        ArrayList<Human> humans = new ArrayList<>();

        humans.add(new Human.HumanBuilder("Smith").setGender("Male").setAge(30).build());
        humans.add(new Human.HumanBuilder("Johnson").setGender("Female").setAge(25).build());
        humans.add(new Human.HumanBuilder("Williams").setGender("Male").setAge(35).build());
        humans.add(new Human.HumanBuilder("Jones").setGender("Female").setAge(28).build());
        InsertionSort<Human> insertionSort = new InsertionSort<>();

        // Define comparator for Integer
        Comparator<Human> humanComparator = Human::compareAgeTo;

        insertionSort.perform(humans, humanComparator);
        for (Human human : humans) {
            System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        }
    }
}
