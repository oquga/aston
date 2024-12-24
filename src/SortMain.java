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
        humans.add(new Human.HumanBuilder("Taylor").setGender("Non-Binary").setAge(22).build());
        humans.add(new Human.HumanBuilder("Brown").setGender("Male").setAge(40).build());
        humans.add(new Human.HumanBuilder("Davis").setGender("Female").setAge(31).build());
        humans.add(new Human.HumanBuilder("Miller").setGender("Female").setAge(29).build());

        InsertionSort<Human> insertionSort = new InsertionSort<>();

        // Define comparator for Integer
        Comparator comparator1 = new HumanAgeComparator();
        insertionSort.perform(humans, comparator1);
        System.out.println("Age:");
        for (Human human : humans) {
            System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        }

        Comparator comparator2 = new HumanSurnameComparator();
        insertionSort.perform(humans, comparator2);
        System.out.println("\nSurname:");
        for (Human human : humans) {
            System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        }

        Comparator comparator3 = new HumanGenderComparator();
        insertionSort.perform(humans, comparator3);
        System.out.println("\nGender:");
        for (Human human : humans) {
            System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        }

    }
}
