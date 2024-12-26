package Interfaces;

import java.util.ArrayList;
import Domain.Animal;
import Domain.Barrel;
import Domain.Human;

public interface Reader {
    ArrayList<Human> getHumans(int amount);

    ArrayList<Animal> getAnimals(int amount);

    ArrayList<Barrel> getBarrels(int amount);
}
