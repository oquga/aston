import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomReader {
    private final Faker faker = new Faker();

    public ArrayList<Human> RandomHumans(int amount) {
        return IntStream.range(0, amount).mapToObj(i -> new Human.HumanBuilder()
                .setSurname(faker.name().lastName())
                .setAge(faker.number().numberBetween(1, 100))
                .setGender(faker.demographic().sex())
                .build()).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Animal> RandomAnimals(int amount) {
        return IntStream.range(0, amount).mapToObj(i -> new Animal.AnimalBuilder()
                .setType(faker.animal().name())
                .setEyeColor(faker.color().name())
                .setHasFur(faker.bool().bool())
                .build()).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<Barrel> RandomBarrels(int amount) {
        String[] made = {"Wood", "Aluminum", "Steel", "Plastic"};
        String[] cont = {"Grains", "Water", "Honey", "Oil", "Alcohol", "Tobacco", "Vegetables", "Juice", "Methylamine"};

        return IntStream.range(0, amount).mapToObj(i -> new Barrel.BarrelBuilder()
                .setVolume(faker.number().randomDouble(3, 0, 100))
                .setMaterial(made[faker.random().nextInt(made.length)])
                .setContent(cont[faker.random().nextInt(cont.length)])
                .build()).collect(Collectors.toCollection(ArrayList::new));
    }
}
