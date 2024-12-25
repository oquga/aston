import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class SearchMain {
    public static void main(String[] args) {
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
        Comparator comparator2 = new HumanSurnameComparator();
        Comparator comparator3 = new HumanGenderComparator();

        insertionSort.perform(humans, comparator1);
        System.out.println("Age:");
        for (Human human : humans) {
            System.out.println("Surname: " + human.getSurname() + ", Age: " + human.getAge() + ", Gender: " + human.getGender());
        }

        BinarySearch binarySearch = new BinarySearch();

        Human searchHuman = new Human.HumanBuilder("Davis").setGender("Female").setAge(31).build();

        System.out.println("\nIndex of searched is equal "+ binarySearch.perform(humans, searchHuman, comparator1));
        System.out.println("\nIndex of searched is equal "+ binarySearch.perform(humans, searchHuman, comparator2));
        System.out.println("\nIndex of searched is equal "+ binarySearch.perform(humans, searchHuman, comparator3));
    }
}

class SearchAnimal{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Adding Animal objects using the builder pattern
        animals.add(new Animal.AnimalBuilder("Dog").SetEyeColor("Brown").isHasFur(true).build());
        animals.add(new Animal.AnimalBuilder("Cat").SetEyeColor("Green").isHasFur(true).build());
        animals.add(new Animal.AnimalBuilder("Fish").SetEyeColor("Blue").isHasFur(false).build());
        animals.add(new Animal.AnimalBuilder("Bird").SetEyeColor("Yellow").isHasFur(false).build());
        animals.add(new Animal.AnimalBuilder("Rabbit").SetEyeColor("Black").isHasFur(true).build());
        animals.add(new Animal.AnimalBuilder("Hamster").SetEyeColor("Brown").isHasFur(true).build());

        InsertionSort insertionSort = new InsertionSort();


        insertionSort.perform(animals, new AnimalTypeComparator());
        System.out.println("Animals sorted by type:");
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " - Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }

        Animal searchAnimal = new Animal.AnimalBuilder("Hamster").SetEyeColor("Brown").isHasFur(true).build();

        System.out.println("\nIndex of searched is equal "+BinarySearch.perform(animals,searchAnimal,new AnimalTypeComparator()));


    }
}

class SearchBarrel{
    public static void main(String[] args) {
        ArrayList<Barrel> barrels = new ArrayList<>();

        // Adding Barrel objects using the builder pattern
        barrels.add(new Barrel.BarrelBuilder(50.0).SetMadeOf("Wood").SetContains("Water").build());
        barrels.add(new Barrel.BarrelBuilder(30.0).SetMadeOf("Metal").SetContains("Oil").build());
        barrels.add(new Barrel.BarrelBuilder(100.0).SetMadeOf("Plastic").SetContains("Wine").build());
        barrels.add(new Barrel.BarrelBuilder(75.0).SetMadeOf("Wood").SetContains("Beer").build());
        barrels.add(new Barrel.BarrelBuilder(60.0).SetMadeOf("Metal").SetContains("Vinegar").build());
        barrels.add(new Barrel.BarrelBuilder(40.0).SetMadeOf("Wood").SetContains("Honey").build());

        InsertionSort insertionSort = new InsertionSort();

        insertionSort.perform(barrels, new BarrelVolumeComparator());
        System.out.println("Volume:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }

        Barrel searchBarrel = new Barrel.BarrelBuilder(60.0).SetMadeOf("Metal").SetContains("Vinegar").build();

        System.out.println("\nIndex of searched is equal "+BinarySearch.perform(barrels,searchBarrel,new BarrelVolumeComparator()));

    }
}

