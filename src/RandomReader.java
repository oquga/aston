import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomReader {
    private Random ran = new Random();
    public ArrayList<Human> RandomHumans(int amount){
        ArrayList<Human> humans = new ArrayList<>();
        String[] gen = {"Male","Female"};
        String[] sur = {"Lotshaw","Fanizza","Ensworth", "Suneson", "Tarazona", "Lepetit", "Kakou", "Prous", "Boldrini", "Stow", "Gunthermann", "Xiong", "Calafell", "Hemley", "Dorje", "Breidel", "Gunther", "Kinnen", "Pettinger", "Bevins"};

        for (int i = 0; i < amount; i++) {
            humans.add(new Human.HumanBuilder()
                    .setSurname(sur[ran.nextInt(sur.length)])
                    .setAge(1 + (int)(Math.random() * ((99 - 1) + 1)))
                    .setGender(gen[ran.nextInt(gen.length)]).build());
        }
        return humans;
    }

    public ArrayList<Animal> RandomAnimals(int amount){
        ArrayList<Animal> animals = new ArrayList<>();
        String[] color = {"Blue","Green","Brown","Amber","Hazel","Grey"};
        String[] type = {"Cat", "Cattle", "Dog", "Donkey", "Goat", "Guineapig", "HorsePig", "Rabbit", "Bunny", "Parrot", "Owl"};

        for (int i = 0; i < amount; i++) {
            animals.add(new Animal.AnimalBuilder()
                    .setType(type[ran.nextInt(type.length)])
                    .setEyeColor(color[ran.nextInt(color.length)])
                    .setFur(ran.nextBoolean()).build());
        }
        return animals;
    }

    public ArrayList<Barrel> RandomBarrels(int amount){
        ArrayList<Barrel> barrels= new ArrayList<>();
        String[] made = {"Wood","Aluminum","Steel", "Plastic"};
        String[] cont = {"Grains", "Water", "Honey", "Oil", "Alcohol", "Tobacco", "Vegetables", "Juice", "Methylamine"};

        for (int i = 0; i < amount; i++) {
            barrels.add(new Barrel.BarrelBuilder()
                    .setVolume((double)Math.round(1.0 + (50.0 - 1.0) * ran.nextDouble()*100d)/100d)
                    .setMaterial(made[ran.nextInt(made.length)])
                    .setContent(cont[ran.nextInt(cont.length)]).build());
        }
        return barrels;
    }
}
