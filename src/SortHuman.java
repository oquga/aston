import java.util.ArrayList;
import java.util.Comparator;

public class SortHuman {
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

class SortAnimal{
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

        // Sort by eye color
        insertionSort.perform(animals, new AnimalEyeColorComparator());
        System.out.println("\nAnimals sorted by eye color:");
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " - Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }

        // Sort by fur presence
        insertionSort.perform(animals, new AnimalFurComparator());
        System.out.println("\nAnimals sorted by fur presence:");
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " - Eye Color: " + animal.getEyeColor() + ", Has Fur: " + animal.getHasFur());
        }
    }
}

class SortBarrel{
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

        insertionSort.perform(barrels, new BarrelContentComparator());
        System.out.println("\nContent:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }

        insertionSort.perform(barrels, new BarrelMaterialComparator());
        System.out.println("\nMaterial:");
        for (Barrel barrel : barrels) {
            System.out.println("Volume: " + barrel.getVolume() + " liters, Material: " + barrel.getMaterial() + ", Content: " + barrel.getContent());
        }
    }
}
