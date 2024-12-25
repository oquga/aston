import java.util.ArrayList;
import java.util.Scanner;

public class ManualReader {
    public ArrayList<Human> ManualHumans(int amount){
        ArrayList<Human> humans = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"Johnson 21 Male\" " + amount + " раз:");
        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");
            humans.add(new Human.HumanBuilder()
                    .setSurname(data[0])
                    .setAge(Integer.parseInt(data[1]))
                    .setGender(data[2]).build());
        }
        return humans;
    }

    public ArrayList<Animal> ManualAnimals(int amount){
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"Dog Brown True\" " + amount + " раз:");
        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");
            animals.add(new Animal.AnimalBuilder()
                    .setType(data[0])
                    .setEyeColor(data[1])
                    .isHasFur(Boolean.parseBoolean(data[2])).build());
        }
        return animals;
    }

    public ArrayList<Barrel> ManualBarrels(int amount){
        ArrayList<Barrel> barrels= new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Вводите информацию в формате \"2.2 Wood Grain\" " + amount + " раз:");
        for (int i = 0; i < amount; i++) {
            String[] data = in.nextLine().split(" ");
            barrels.add(new Barrel.BarrelBuilder()
                    .setVolume(Double.parseDouble(data[0]))
                    .setMaterial(data[1])
                    .setContent(data[2]).build());
        }
        return barrels;
    }
}
